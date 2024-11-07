package com.project.cleanarchi.core.application.usecase.dummy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.cleanarchi.core.application.dto.Dummy;
import com.project.cleanarchi.core.application.model.dummy.response.GetAllDataRes;
import com.project.cleanarchi.core.domain.entity.DummyEntity;
import com.project.cleanarchi.core.domain.repository.DummyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetAllData {
    private final DummyRepository dummyRepository;

    public List<GetAllDataRes> execute() {
        // Ambil daftar entitas Dummy dari database
        List<DummyEntity> result = dummyRepository.findAll();

        // Ubah entitas menjadi DTO
        List<Dummy> allDatas = result.stream()
            .map(entity -> new Dummy(entity.getName()))  // Konversi DummyEntity ke Dummy
            .collect(Collectors.toList());

        // Bungkus dalam objek GetAllDataRes dan kembalikan
        GetAllDataRes response = new GetAllDataRes(allDatas);
        return Collections.singletonList(response);  // Mengembalikan daftar objek GetAllDataRes
    }
}
