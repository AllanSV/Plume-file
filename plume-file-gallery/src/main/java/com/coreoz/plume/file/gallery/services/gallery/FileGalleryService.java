package com.coreoz.plume.file.gallery.services.gallery;

import java.util.Collection;
import java.util.List;

import com.coreoz.plume.file.services.file.FileUploaded;

public interface FileGalleryService {

	// insert

	FileGallery add(FileUploaded fileUploaded, FileGalleryType galleryType, int initialPosition, Long idData);

	default FileGallery add(FileUploaded fileUploaded, FileGalleryType galleryType, int initialPosition) {
		return add(fileUploaded, galleryType, initialPosition, null);
	}

	default FileGallery add(FileUploaded fileUploaded, FileGalleryType galleryType) {
		return add(fileUploaded, galleryType, 0, null);
	}

	// update

	void updatePositions(Collection<FileGalleryPosition> newPositions);

	// clean

	void deleteUnreferenced();

	// search

	List<FileGallery> fetch(FileGalleryType galleryType, Long idData);

	default List<FileGallery> fetch(FileGalleryType galleryType) {
		return fetch(galleryType, null);
	}

	// check

	boolean checkFilesInGallery(Collection<Long> fileIds, FileGalleryType galleryType, Long idData);

	default boolean checkFilesInGallery(Collection<Long> fileIds, FileGalleryType galleryType) {
		return checkFilesInGallery(fileIds, galleryType, null);
	}

}
