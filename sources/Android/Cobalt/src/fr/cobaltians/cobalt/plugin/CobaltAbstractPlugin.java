/**
 *
 * CobaltAbstractPlugin
 * Cobalt
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Cobaltians
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package fr.cobaltians.cobalt.plugin;

import fr.cobaltians.cobalt.fragments.CobaltFragment;

import android.app.Activity;

import org.json.JSONObject;

/**
 * Created by sebastienfamel on 15/07/2014.
 */
public abstract class CobaltAbstractPlugin {
	
	// TAG
	protected static final String TAG = CobaltAbstractPlugin.class.getSimpleName();

    /********************************************
     * MEMBERS
     ********************************************/
	
	protected Activity mActivity;
	protected CobaltFragment mFragment;
	protected CobaltPluginManager mPluginManager;

	/***********************************************************************************************************
     * CONSTRUCTORS
     ***********************************************************************************************************/

    public CobaltAbstractPlugin(Activity activity, CobaltFragment fragment, CobaltPluginManager pluginManager) {
    	mActivity = activity;
    	mFragment = fragment;
    	mPluginManager = pluginManager;
    }

    /**************************************************
     * ABSTRACT METHODS
     **************************************************/
    
    public abstract void onMessage(JSONObject message);
}
