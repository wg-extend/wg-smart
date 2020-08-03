package com.wg.smart.utils;

import lombok.Data;

@Data
public final class EsEntity<T> {

	private String id;
	private T data;

}