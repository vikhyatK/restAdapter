package com.adapter.restadapter.service;

import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;

@Service
public class DataTransformer {

	public DataObject stringToObjectConverter(String data) {
		DataObject dataObject = new DataObject();
		dataObject.setTIPO_TRAMA(data.substring(0, 2));
		dataObject.setDIGITO(data.substring(2, 3));
		dataObject.setCODIGO(data.substring(3, 6));
		dataObject.setAFILIADO(data.substring(6, 9));
		dataObject.setHORA_TRAMA(data.substring(9, 35));
		dataObject.setESTADO(data.substring(35, 36));
		dataObject.setTRADER(data.substring(36, 44));
		dataObject.setHORA_OPERACION(data.substring(44, 70));
		dataObject.setFOLIO(data.substring(70, 80));
		dataObject.setPUNTA(data.substring(80, 81));
		dataObject.setCOD_CORR(data.substring(81, 84));
		dataObject.setMERCADO(data.substring(84, 85));
		dataObject.setMNEMOTECNICO(data.substring(85, 97));
		dataObject.setFEC_CUMPLIMIENTO(data.substring(97, 105));
		dataObject.setDIAS_CUMPLIMIENTO(data.substring(105, 110));
		dataObject.setCANTIDAD(data.substring(110, 124));
		dataObject.setPRECIO(data.substring(124, 140));
		dataObject.setMONTO(data.substring(140, 158));
		dataObject.setCOD_ISIN(data.substring(158, 170));
		dataObject.setFUNGIBLE(data.substring(170, 180));
		dataObject.setTASA_REFERENCIA(data.substring(180, 184));
		dataObject.setMONEDA(data.substring(184, 187));
		dataObject.setVAL_MONEDA(data.substring(187, 200));
		dataObject.setPTOS_TASA_REFERENCIA(data.substring(200, 216));
		dataObject.setBASE_CALCULO(data.substring(216, 217));
		dataObject.setPERIODICIDAD(data.substring(217, 218));
		dataObject.setDURACION(data.substring(218, 225));
		dataObject.setTIPO_OPERACION_CONTINUA(data.substring(225, 226));
		dataObject.setMNEMO_SERIALIZADO(data.substring(226, 238));
		dataObject.setUBI_TITULO(data.substring(238, 241));
		dataObject.setTASA(data.substring(241, 257));
		dataObject.setLOTE(data.substring(257, 258));
		dataObject.setCREA_MERCADO(data.substring(258, 261));
		dataObject.setTIPO_OPERACION_SERIALIZADA(data.substring(261, 262));
		dataObject.setREINVERSION(data.substring(262, 264));
		dataObject.setTIPO_TITULO(data.substring(264, 267));
		dataObject.setMODALIDAD(data.substring(267, 268));
		dataObject.setTIPO_OPERACION(data.substring(268, 269));
		dataObject.setFIJA_PRECIO(data.substring(269, 270));
		dataObject.setEXDIVIDENDO(data.substring(270, 271));
		dataObject.setESTA_DEPOSITO(data.substring(271, 272));
		dataObject.setPRE_ACORDADO(data.substring(272, 273));
		dataObject.setPROM_LIQUIDEZ(data.substring(273, 274));
		dataObject.setPRE_LIMPIO(data.substring(274, 281));
		dataObject.setFEC_MONEDA(data.substring(281, 289));
		dataObject.setEST_TITULO(data.substring(289, 290));
		dataObject.setRUEDA_NEGOCIACION(data.substring(290, 294));
		dataObject.setDIAS_VENCIMIENTO(data.substring(294, 299));
		dataObject.setFEC_VENCIMIENTO(data.substring(299, 307));
		dataObject.setFEC_EMISION(data.substring(307, 315));
		dataObject.setPLA_EMISION(data.substring(315, 320));
		dataObject.setTASA_EMISION(data.substring(320, 336));
		dataObject.setCOD_CUMPLIMIENTO(data.substring(336, 339));
		dataObject.setORIG_PUNTA(data.substring(339, 340));
		dataObject.setTRANSACCION(data.substring(340, 341));
		dataObject.setPLA_LIQUIDACION(data.substring(341, 342));
		dataObject.setTIPO_SIMULTANEA(data.substring(342, 343));
		dataObject.setTASA_REPO(data.substring(343, 359));
		dataObject.setPLA_REPO(data.substring(359, 364));
		dataObject.setFEC_REPO(data.substring(364, 372));
		dataObject.setMON_REPO(data.substring(372, 390));
		dataObject.setVAL_CAPTACION(data.substring(390, 405));
		dataObject.setTIPO_MERCADO(data.substring(405, 407));
		dataObject.setRADICADO(data.substring(407, 419));
		dataObject.setVENTA_CORTO(data.substring(419, 420));
		dataObject.setTASA_TTV(data.substring(420, 436));
		dataObject.setPTI(data.substring(436, 437));
		dataObject.setPET(data.substring(437, 440));
		dataObject.setCONTRAPARTE(data.substring(440, 443));
		dataObject.setSEQTYPE(data.substring(443, 449));
		dataObject.setSEQNUMBER(data.substring(449, 461));
		dataObject.setHORAOPE(data.substring(461, 466));
		dataObject.setBROKEREFCOMPRA(data.substring(466, 474));
		dataObject.setBROKEREFVENTA(data.substring(342, 343));
		return dataObject;
	}
}
