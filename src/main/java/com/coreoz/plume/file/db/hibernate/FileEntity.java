package com.coreoz.plume.file.db.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.coreoz.plume.db.hibernate.utils.HibernateIdGenerator;
import com.coreoz.plume.file.db.FileEntry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
@Entity
@Table(name = "plm_file")
class FileEntity implements FileEntry {

	@GeneratedValue(generator = HibernateIdGenerator.NAME)
	@Id
	private Long id;
	private String filename;
	@Column(name = "file_type")
	private String fileType;
	private byte[] data;

}
