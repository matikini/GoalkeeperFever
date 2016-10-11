package com.example.a41665767.goalkeeperfever;

import android.util.Log;

import org.cocos2d.nodes.Director;
import org.cocos2d.opengl.CCGLSurfaceView;

/**
 * Created by 41665767 on 11/10/2016.
 */
public class clsJuego {
    CCGLSurfaceView _VistaDelJuego;
    public clsJuego(CCGLSurfaceView VistaDelJuego){
        Log.d("Bob", "Comienza el constructor de la clase");
        _VistaDelJuego = VistaDelJuego;
    }

    public void ComenzarJuego(){
        Log.d("Comenzar", "Comienza el juego");
        Director.sharedDirector().attachInView(_VistaDelJuego);
    }
}
