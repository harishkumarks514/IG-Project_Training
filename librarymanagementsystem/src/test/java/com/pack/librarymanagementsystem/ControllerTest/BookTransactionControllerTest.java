package com.pack.librarymanagementsystem.ControllerTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.entity.BookTransaction;
import com.pack.librarymanagementsystem.service.impl.BookTransactionServiceImpl;

@WebMvcTest(value = BookTransactionControllerTest.class)
public class BookTransactionControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BookTransactionServiceImpl bookIssueService;

	@Autowired
	private ObjectMapper objectMapper;
	
	private BookTransaction bookIssue;
	
	@DisplayName("Junit test for creating new bookIssue Transaction using rest api")
    @Test
    public void givenBookIssuedObject_whenInsertBookIssued_thenReturnSavedTransaction() throws Exception{        
		BookTransaction bookTransaction = BookTransaction.builder().remarks("Approved").
				transactionStatus("Transaction Approved").build();
    BDDMockito.given(bookIssueService.saveTransaction(bookTransaction, 2L, 1l)).willAnswer(invocation -> invocation.getArgument(0));

        ResultActions response = mockMvc.perform(PostMapping("/Transaction/1/2/1")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(bookTransaction)));
        response.andDo(print()).
                andExpect(status().isCreated());
    }
	
	@DisplayName("Junit test for geting all transaction using rest api")
	@Test
	public void givenBookObjectList_whenGetAllUser_thenReturnBookList() throws Exception {
		List<BookTransaction> transactionList = new ArrayList()<>();
		transactionList.add(BookTransaction.builder().remarks("Approved").
				transactionStatus("Transaction Approved").build());
		transactionList.add(BookTransaction.builder().remarks("Rejected").
				transactionStatus("Transaction Approved").build());
		BDDMockito.given(bookIssueService.findAllBookIssued()).willReturn(transactionList);
		ResultActions response = mockMvc.perform(GetMapping("/getAllTransaction"));
		response.andExpect(status().isOk());
	}
	
	@DisplayName("Junit test for get transaction by transaction id using rest api")
	@Test
	public void givenBookObject_whenGetbyName_thenReturnBookObject() throws Exception {
		BookTransaction bookIssuedTransaction = BookTransaction.builder().transactionId(1L).remarks("Approved").
				transactionStatus("Transaction Approved").build();
		BDDMockito.given(bookIssueService.findTransactionByTransactionId(1L)).willReturn(Optional.of(bookIssuedTransaction));
		ResultActions response = mockMvc.perform(GetMapping("/getTransactionByTransactionId/1", bookIssuedTransaction.getTransactionId()));
		response.andExpect(status().isOk()).andDo(print());
	}
	@DisplayName("Junit test for update transaction  using rest api")
	@Test
	public void givenBookObject_whenToUpdateTransaction_thenReturnBookObject() throws Exception {
		Book savedbook = Book.builder().bookId(1L)
                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying")
          
                .build();
		
		BookTransaction bookIssuedTransaction = BookTransaction.builder().transactionId(1L).bookActualreturndate(new Date()).
				remarks("Approved").bookIssueddate(new Date()).bookReturndate(new Date()).bookId(savedbook).
				transactionStatus("Transaction Approved").build();
		
		BookTransaction updatedbookIssuedTransaction = BookTransaction.builder().transactionId(1L).bookActualreturndate(new Date()).
				remarks("Rejected").bookIssueddate(new Date()).bookReturndate(new Date()).bookId(savedbook).
				transactionStatus("Rejected").build();
		
		BDDMockito.given(bookIssueService.findTransactionByTransactionId(1L)).willReturn(Optional.of(bookIssuedTransaction));
		BDDMockito.given(bookIssueService.updateTransaction(updatedbookIssuedTransaction)).willReturn(updatedbookIssuedTransaction);
		ResultActions response = mockMvc.perform(PutMapping("/updateTransaction"));
		response.andExpect(status().isOk()).andDo(print());
	}
	
}
