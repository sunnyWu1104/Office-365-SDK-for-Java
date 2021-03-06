/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Device
 .
 */
public class DeviceFetcher extends OrcEntityFetcher<Device,DeviceOperations> 
                                     implements Readable<Device> {

     /**
     * Instantiates a new DeviceFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DeviceFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Device.class, DeviceOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DeviceFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DeviceFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets registered owners.
     *
     * @return the registered owners
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getRegisteredOwners() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("registeredOwners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets registered owner.
     *
     * @return the registered owner
     */
    public DirectoryObjectFetcher getRegisteredOwner(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("registeredOwners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets registered users.
     *
     * @return the registered users
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getRegisteredUsers() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("registeredUsers", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets registered user.
     *
     * @return the registered user
     */
    public DirectoryObjectFetcher getRegisteredUser(String id){
         return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("registeredUsers", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

}
