package com.swapnil.service;

import java.util.List;

import com.swapnil.exception.CategoryException;
import com.swapnil.model.Entry;
import com.swapnil.model.ResultDTO;

public interface MyService {

	public List<ResultDTO> getTitle(String category) throws CategoryException;
	
	public List<Entry> saveEntry(Entry entry);
	
}
