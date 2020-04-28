package com.vogella.tasks.services.internal;


import org.osgi.service.component.annotations.Component;

import com.vogella.tasks.model.ITodoService;
import com.vogella.tasks.model.Todo;

@Component
public class MyTodoServiceImpl implements ITodoService {

	@Override
	public Todo getTodo(int id) {
		return new Todo();
	}

}
