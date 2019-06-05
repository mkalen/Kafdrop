/*
 * Copyright 2017 HomeAdvisor, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.homeadvisor.kafdrop.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrokerVO
{
   private int id;
   private String host;
   private int port;
   private int jmxPort;
   private int version;
   private boolean controller;
   private Map<String,String> listenerSecurityProtocolMap;
   private List<String> endpoints;
   private Date timestamp;

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getHost()
   {
      return host;
   }

   public void setHost(String host)
   {
      this.host = host;
   }

   public int getPort()
   {
      return port;
   }

   public void setPort(int port)
   {
      this.port = port;
   }

   public int getJmxPort()
   {
      return jmxPort;
   }

   @JsonProperty("jmx_port")
   public void setJmxPort(int jmxPort)
   {
      this.jmxPort = jmxPort;
   }

   public int getVersion()
   {
      return version;
   }

   public void setVersion(int version)
   {
      this.version = version;
   }

   public Date getTimestamp()
   {
      return timestamp;
   }

   public void setTimestamp(Date timestamp)
   {
      this.timestamp = timestamp;
   }

   public boolean isController()
   {
      return controller;
   }

   public void setController(boolean controller)
   {
      this.controller = controller;
   }

   public Map<String,String> getListenerSecurityProtocolMap()
   {
       return this.listenerSecurityProtocolMap;
   }

   public void setListenerSecurityProtocolMap(Map<String,String> listenerSecurityProtocolMap)
   {
       this.listenerSecurityProtocolMap = listenerSecurityProtocolMap;
   }

   public List<String> getEndpoints()
   {
       return this.endpoints;
   }

   public void setEndpoints(List<String> endpoints)
   {
       this.endpoints = endpoints;
   }
}
