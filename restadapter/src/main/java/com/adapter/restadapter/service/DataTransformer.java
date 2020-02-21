package com.adapter.restadapter.service;

import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;

@Service
public class DataTransformer {

	public DataObject stringToObjectConverter(String data) {
		DataObject dataObject = new DataObject();
		dataObject.setTIPO_TRAMA(data.substring(0, 2).trim());
		dataObject.setDIGITO(data.substring(2, 3).trim());
		dataObject.setCODIGO(data.substring(3, 6).trim());
		dataObject.setAFILIADO(data.substring(6, 9).trim());
		dataObject.setHORA_TRAMA(data.substring(9, 35).trim());
		dataObject.setESTADO(data.substring(35, 36).trim());
		dataObject.setTRADER(data.substring(36, 44).trim());
		dataObject.setHORA_OPERACION(data.substring(44, 70).trim());
		dataObject.setFOLIO(data.substring(70, 80).trim());
		dataObject.setPUNTA(data.substring(80, 81).trim());
		dataObject.setCOD_CORR(data.substring(81, 84).trim());
		dataObject.setMERCADO(data.substring(84, 85).trim());
		dataObject.setMNEMOTECNICO(data.substring(85, 97).trim());
		dataObject.setFEC_CUMPLIMIENTO(data.substring(97, 105).trim());
		dataObject.setDIAS_CUMPLIMIENTO(data.substring(105, 110).trim());
		dataObject.setCANTIDAD(data.substring(110, 124).trim());
		dataObject.setPRECIO(data.substring(124, 140).trim());
		dataObject.setMONTO(data.substring(140, 158).trim());
		dataObject.setCOD_ISIN(data.substring(158, 170).trim());
		dataObject.setFUNGIBLE(data.substring(170, 180).trim());
		dataObject.setTASA_REFERENCIA(data.substring(180, 184).trim());
		dataObject.setMONEDA(data.substring(184, 187).trim());
		dataObject.setVAL_MONEDA(data.substring(187, 200).trim());
		dataObject.setPTOS_TASA_REFERENCIA(data.substring(200, 216).trim());
		dataObject.setBASE_CALCULO(data.substring(216, 217).trim());
		dataObject.setPERIODICIDAD(data.substring(217, 218).trim());
		dataObject.setDURACION(data.substring(218, 225).trim());
		dataObject.setTIPO_OPERACION_CONTINUA(data.substring(225, 226).trim());
		dataObject.setMNEMO_SERIALIZADO(data.substring(226, 238).trim());
		dataObject.setUBI_TITULO(data.substring(238, 241).trim());
		dataObject.setTASA(data.substring(241, 257).trim());
		dataObject.setLOTE(data.substring(257, 258).trim());
		dataObject.setCREA_MERCADO(data.substring(258, 261).trim());
		dataObject.setTIPO_OPERACION_SERIALIZADA(data.substring(261, 262).trim());
		dataObject.setREINVERSION(data.substring(262, 264).trim());
		dataObject.setTIPO_TITULO(data.substring(264, 267).trim());
		dataObject.setMODALIDAD(data.substring(267, 268).trim());
		dataObject.setTIPO_OPERACION(data.substring(268, 269).trim());
		dataObject.setFIJA_PRECIO(data.substring(269, 270).trim());
		dataObject.setEXDIVIDENDO(data.substring(270, 271).trim());
		dataObject.setESTA_DEPOSITO(data.substring(271, 272).trim());
		dataObject.setPRE_ACORDADO(data.substring(272, 273).trim());
		dataObject.setPROM_LIQUIDEZ(data.substring(273, 274).trim());
		dataObject.setPRE_LIMPIO(data.substring(274, 281).trim());
		dataObject.setFEC_MONEDA(data.substring(281, 289).trim());
		dataObject.setEST_TITULO(data.substring(289, 290).trim());
		dataObject.setRUEDA_NEGOCIACION(data.substring(290, 294).trim());
		dataObject.setDIAS_VENCIMIENTO(data.substring(294, 299).trim());
		dataObject.setFEC_VENCIMIENTO(data.substring(299, 307).trim());
		dataObject.setFEC_EMISION(data.substring(307, 315).trim());
		dataObject.setPLA_EMISION(data.substring(315, 320).trim());
		dataObject.setTASA_EMISION(data.substring(320, 336).trim());
		dataObject.setCOD_CUMPLIMIENTO(data.substring(336, 339).trim());
		dataObject.setORIG_PUNTA(data.substring(339, 340).trim());
		dataObject.setTRANSACCION(data.substring(340, 341).trim());
		dataObject.setPLA_LIQUIDACION(data.substring(341, 342).trim());
		dataObject.setTIPO_SIMULTANEA(data.substring(342, 343).trim());
		dataObject.setTASA_REPO(data.substring(343, 359).trim());
		dataObject.setPLA_REPO(data.substring(359, 364).trim());
		dataObject.setFEC_REPO(data.substring(364, 372).trim());
		dataObject.setMON_REPO(data.substring(372, 390).trim());
		dataObject.setVAL_CAPTACION(data.substring(390, 405).trim());
		dataObject.setTIPO_MERCADO(data.substring(405, 407).trim());
		dataObject.setRADICADO(data.substring(407, 419).trim());
		dataObject.setVENTA_CORTO(data.substring(419, 420).trim());
		dataObject.setTASA_TTV(data.substring(420, 436).trim());
		dataObject.setPTI(data.substring(436, 437).trim());
		dataObject.setPET(data.substring(437, 440).trim());
		dataObject.setCONTRAPARTE(data.substring(440, 443).trim());
		dataObject.setSEQTYPE(data.substring(443, 449).trim());
		dataObject.setSEQNUMBER(data.substring(449, 461).trim());
		dataObject.setHORAOPE(data.substring(461, 466).trim());
		dataObject.setBROKEREFCOMPRA(data.substring(466, 474).trim());
		dataObject.setBROKEREFVENTA(data.substring(342, 343).trim());
		return dataObject;
	}
}
