package com.example.CompucaliTVPro.persistencia.DTO;
import com.example.CompucaliTVPro.persistencia.entidad.*;

public class TipoDeContenidoDTO {

    private int IdTipoContenido;

    private String nombreTipoContenido;

    public TipoDeContenidoDTO() {
    }

    public TipoDeContenidoDTO(int idTipoContenido, String nombreTipoContenido) {
        IdTipoContenido = idTipoContenido;
        this.nombreTipoContenido = nombreTipoContenido;
    }

    public int getIdTipoContenido() {
        return IdTipoContenido;
    }

    public void setIdTipoContenido(int idTipoContenido) {
        IdTipoContenido = idTipoContenido;
    }

    public String getNombreTipoContenido() {
        return nombreTipoContenido;
    }

    public void setNombreTipoContenido(String nombreTipoContenido) {
        this.nombreTipoContenido = nombreTipoContenido;
    }

    public static TipoDeContenidoDTO toDTO(TipoDeContenido tipoDeContenido) {
        TipoDeContenidoDTO tipoDeContenidoDTO = new TipoDeContenidoDTO();
        tipoDeContenidoDTO.setIdTipoContenido(tipoDeContenido.getIdTipoContenido());
        tipoDeContenidoDTO.setNombreTipoContenido(tipoDeContenido.getNombreTipoContenido());
        return tipoDeContenidoDTO;
    }


}
