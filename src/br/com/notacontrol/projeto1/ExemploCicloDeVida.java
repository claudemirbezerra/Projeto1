package br.com.notacontrol.projeto1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class ExemploCicloDeVida extends Activity {

	private static final String CATEGORIA = "curso_android";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(CATEGORIA,getClassName()+".onCreate() chamado");
		TextView texto = new TextView(this);
		texto.setText("Exemplo Ciclo de Vida");		
		setContentView(texto);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(CATEGORIA, getClassName()+".onStart() chamado");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(CATEGORIA, getClassName()+".onRestart() chamado");
		
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(CATEGORIA, getClassName()+".onStop() chamado");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(CATEGORIA, getClassName()+".onDestroy() chamado");
	}
	
	private String getClassName(){
		String name = getClass().getName();
		
		return name.substring(name.lastIndexOf("."));
	}
	
	
}
