package com.fincatto.documentofiscal.cte300.transformes;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte300.classes.CTIndicadoNegociavel;

public class CTIndicadoNegociavelTransformer implements Transform<CTIndicadoNegociavel> {

	@Override
	public CTIndicadoNegociavel read(String arg0) throws Exception {
		// TODO Auto-generated method stub
		return CTIndicadoNegociavel.valueOfCodigo(arg0);
	}

	@Override
	public String write(CTIndicadoNegociavel arg0) throws Exception {
		// TODO Auto-generated method stub
		return arg0.getCodigo();
	}

}
