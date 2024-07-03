package com.voluntarios.entity.entities;

import lombok.Getter;

@Getter
public enum DonationItem {
    ALIMENTOS_NAO_PERECIVEIS("Alimentos não perecíveis"),
    ALIMENTOS_PERECIVEIS("Alimentos perecíveis"),
    BRINQUEDOS("Brinquedos"),
    COBERTORES_E_COBERTAS("Cobertores e cobertas"),
    ROUPAS_DE_CAMA("Roupas de cama"),
    MATERIAL_DE_CONSTRUCAO("Material de construção"),
    MATERIAL_ESCOLAR("Material escolar"),
    MOVEIS("Móveis"),
    PRENDAS("Prendas"),
    PRODUTOS_DE_HIGIENE_PESSOAL("Produtos de higiene pessoal"),
    PRODUTOS_DE_LIMPEZA("Produtos de limpeza"),
    PRODUTOS_PARA_BEBES("Produtos para bebês"),
    RACAO_PARA_PETS("Ração para PETs"),
    ROUPAS_DE_ADULTO("Roupas de adulto"),
    ROUPAS_INFANTIS("Roupas infantis"),
    SAPATOS("Sapatos"),
    UTENSILIOS_DOMESTICOS("Utensílios domésticos"),
    OUTROS("Outros"),
    QUADROS_NEGROS_OU_BRANCOS("Quadros negros ou brancos"),
    CARTEIRAS_ESCOLARES("Carteiras escolares");

    private final String description;

    DonationItem(String description) {
        this.description = description;
    }

}
