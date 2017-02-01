package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class pedido implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Empresa")
   private java.lang.Integer cd_empresa;
   @org.kie.api.definition.type.Label(value = "Pedido")
   private java.lang.Integer pedido;
   @org.kie.api.definition.type.Label(value = "Ano")
   private java.lang.Integer ano;
   @org.kie.api.definition.type.Label(value = "Roteiro")
   private char sigla_roteiro;
   @org.kie.api.definition.type.Label(value = "Filial")
   private java.lang.Integer filial_operac;
   @org.kie.api.definition.type.Label(value = "Faturado S/N")
   private boolean flag_fatura;
   @org.kie.api.definition.type.Label(value = "Data ETA")
   private java.util.Date data_eta;
   @org.kie.api.definition.type.Label(value = "Data de Vencimento")
   private java.util.Date dt_vencimento;
   @org.kie.api.definition.type.Label(value = "Dias de Atraso")
   private java.lang.Integer dias_de_atraso;
   @org.kie.api.definition.type.Label(value = "Dias a Vencer")
   private java.lang.Integer dias_a_vencer;

   public pedido()
   {
   }

   public java.lang.Integer getCd_empresa()
   {
      return this.cd_empresa;
   }

   public void setCd_empresa(java.lang.Integer cd_empresa)
   {
      this.cd_empresa = cd_empresa;
   }

   public java.lang.Integer getPedido()
   {
      return this.pedido;
   }

   public void setPedido(java.lang.Integer pedido)
   {
      this.pedido = pedido;
   }

   public java.lang.Integer getAno()
   {
      return this.ano;
   }

   public void setAno(java.lang.Integer ano)
   {
      this.ano = ano;
   }

   public char getSigla_roteiro()
   {
      return this.sigla_roteiro;
   }

   public void setSigla_roteiro(char sigla_roteiro)
   {
      this.sigla_roteiro = sigla_roteiro;
   }

   public java.lang.Integer getFilial_operac()
   {
      return this.filial_operac;
   }

   public void setFilial_operac(java.lang.Integer filial_operac)
   {
      this.filial_operac = filial_operac;
   }

   public boolean isFlag_fatura()
   {
      return this.flag_fatura;
   }

   public void setFlag_fatura(boolean flag_fatura)
   {
      this.flag_fatura = flag_fatura;
   }

   public java.util.Date getData_eta()
   {
      return this.data_eta;
   }

   public void setData_eta(java.util.Date data_eta)
   {
      this.data_eta = data_eta;
   }

   public java.util.Date getDt_vencimento()
   {
      return this.dt_vencimento;
   }

   public void setDt_vencimento(java.util.Date dt_vencimento)
   {
      this.dt_vencimento = dt_vencimento;
   }

   public java.lang.Integer getDias_de_atraso()
   {
      return this.dias_de_atraso;
   }

   public void setDias_de_atraso(java.lang.Integer dias_de_atraso)
   {
      this.dias_de_atraso = dias_de_atraso;
   }

   public java.lang.Integer getDias_a_vencer()
   {
      return this.dias_a_vencer;
   }

   public void setDias_a_vencer(java.lang.Integer dias_a_vencer)
   {
      this.dias_a_vencer = dias_a_vencer;
   }

   public pedido(java.lang.Integer cd_empresa, java.lang.Integer pedido,
         java.lang.Integer ano, char sigla_roteiro,
         java.lang.Integer filial_operac, boolean flag_fatura,
         java.util.Date data_eta, java.util.Date dt_vencimento,
         java.lang.Integer dias_de_atraso, java.lang.Integer dias_a_vencer)
   {
      this.cd_empresa = cd_empresa;
      this.pedido = pedido;
      this.ano = ano;
      this.sigla_roteiro = sigla_roteiro;
      this.filial_operac = filial_operac;
      this.flag_fatura = flag_fatura;
      this.data_eta = data_eta;
      this.dt_vencimento = dt_vencimento;
      this.dias_de_atraso = dias_de_atraso;
      this.dias_a_vencer = dias_a_vencer;
   }

}