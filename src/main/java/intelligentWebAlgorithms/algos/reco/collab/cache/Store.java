/*
 *   ________________________________________________________________________________________
 *   
 *   Y O O R E E K A
 *   A library for data mining, machine learning, soft computing, and mathematical analysis
 *   ________________________________________________________________________________________ 
 *    
 *   The Yooreeka project started with the code of the book "Algorithms of the Intelligent Web " 
 *   (Manning 2009). Although the term "Web" prevailed in the title, in essence, the algorithms 
 *   are valuable in any software application.
 *  
 *   Copyright (c) 2007-2009 Haralambos Marmanis & Dmitry Babenko
 *   Copyright (c) 2009-${year} Marmanis Group LLC and individual contributors as indicated by the @author tags.  
 * 
 *   Certain library functions depend on other Open Source software libraries, which are covered 
 *   by different license agreements. See the NOTICE file distributed with this work for additional 
 *   information regarding copyright ownership and licensing.
 * 
 *   Marmanis Group LLC licenses this file to You under the Apache License, Version 2.0 (the "License"); 
 *   you may not use this file except in compliance with the License.  
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under 
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 *   either express or implied. See the License for the specific language governing permissions and
 *   limitations under the License.
 *   
 */
package intelligentWebAlgorithms.algos.reco.collab.cache;

/**
 * A <code>Store</code> provides service for persisting pre-calculated data.
 */
public interface Store {
	/**
	 * Checks if key already exists.
	 * 
	 * @param key
	 *            object id.
	 * @return true if the key already exists.
	 */
	public boolean exists(String key);

	/**
	 * Retrieves object by key.
	 * 
	 * @param key
	 *            identifies data to retrieve.
	 * @return
	 */
	public Object get(String key);

	/**
	 * Persists object. Overwrites previously stored data with the same id.
	 * 
	 * @param key
	 *            id to identify the object.
	 * @param o
	 *            object to be stored.
	 */
	public void put(String key, Object o);

	/**
	 * Deletes object.
	 * 
	 * @param key
	 *            identifies object to retrieve.
	 */
	public void remove(String key);
}