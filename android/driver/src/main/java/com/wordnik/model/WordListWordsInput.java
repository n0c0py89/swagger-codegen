package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class WordListWordsInput extends WordnikObject {

		 //ID of WordList to use
		 private String wordListId ;  
			 //Field to sort by
		 private String sortBy ;  
			 //Direction to sort
		 private String sortOrder ;  
			 //Results to skip
		 private String skip ;  
			 //Maximum number of results to return
		 private String limit ;  
		
	
		 //ID of WordList to use
		 
		 public String getWordListId() {
		 	return wordListId;
		 }  
		 
		 public void setWordListId(String  wordListId) {
		 	this.wordListId = wordListId;
		 }
			 //Field to sort by
		 @AllowableValues(value="createDate,alpha")	 
		 public String getSortBy() {
		 	return sortBy;
		 }  
		 
		 public void setSortBy(String  sortBy) {
		 	this.sortBy = sortBy;
		 }
			 //Direction to sort
		 @AllowableValues(value="asc,desc")	 
		 public String getSortOrder() {
		 	return sortOrder;
		 }  
		 
		 public void setSortOrder(String  sortOrder) {
		 	this.sortOrder = sortOrder;
		 }
			 //Results to skip
		 
		 public String getSkip() {
		 	return skip;
		 }  
		 
		 public void setSkip(String  skip) {
		 	this.skip = skip;
		 }
			 //Maximum number of results to return
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
		
}