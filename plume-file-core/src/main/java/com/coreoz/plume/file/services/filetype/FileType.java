package com.coreoz.plume.file.services.filetype;

import com.coreoz.plume.file.db.FileEntry;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.dsl.NumberPath;

public interface FileType {

	String name();

	/**
	 * The entity that contains a column that referenced the {@link FileEntry} ID
	 */
	EntityPath<?> getFileEntity();

	/**
	 * The column that has a reference to {@link FileEntry} ID
	 */
	NumberPath<Long> getJoinColumn();

}
