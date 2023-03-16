package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface VisionService {

	String extractTextFromImage(MultipartFile file);

	String getLandmarkFromImage(MultipartFile file);

	String detectLabelFromImage(MultipartFile file);

	List<String> extractTextFromPdf(MultipartFile file);

	byte[] detectFaceFromImage(MultipartFile file) throws IOException;

}
