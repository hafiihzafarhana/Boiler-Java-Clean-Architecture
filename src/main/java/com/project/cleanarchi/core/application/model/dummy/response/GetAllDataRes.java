package com.project.cleanarchi.core.application.model.dummy.response;

import java.util.List;

import com.project.cleanarchi.core.application.dto.Dummy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetAllDataRes {
    private List<Dummy> allDatas;
}
