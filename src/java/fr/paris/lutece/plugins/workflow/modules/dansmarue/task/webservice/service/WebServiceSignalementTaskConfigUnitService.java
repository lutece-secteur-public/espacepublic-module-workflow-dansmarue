/*
 * Copyright (c) 2002-2020, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.workflow.modules.dansmarue.task.webservice.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import fr.paris.lutece.plugins.workflow.modules.dansmarue.task.webservice.business.WebServiceSignalementTaskConfigUnit;
import fr.paris.lutece.plugins.workflow.modules.dansmarue.task.webservice.business.WebServiceSignalementTaskConfigUnitDAO;
import fr.paris.lutece.portal.service.plugin.Plugin;


/**
 * IWebServiceSignalementTaskConfigUnitService.
 */
public class WebServiceSignalementTaskConfigUnitService
{
    
    /** The dao. */
    // DAO
    @Inject
    @Named( "signalement.webserviceSignalementTaskConfigUnitDAO" )
    private WebServiceSignalementTaskConfigUnitDAO _dao;

    /**
     * Insert.
     *
     * @param config            the task configuration
     * @param plugin            the plugin
     */
    public void insert( WebServiceSignalementTaskConfigUnit config, Plugin plugin )
    {
        _dao.insert( config, plugin );
    }

    /**
     * Update.
     *
     * @param config            the task configuration
     * @param plugin            the plugin
     */
    public void update( WebServiceSignalementTaskConfigUnit config, Plugin plugin )
    {
        _dao.update( config, plugin );
    }

    /**
     * Find by primary key.
     *
     * @param nIdTask            the task id
     * @param nIdUnit            the unit id
     * @param plugin            the plugin
     * @return WebServiceSignalementTaskConfigUnit
     */
    public WebServiceSignalementTaskConfigUnit findByPrimaryKey( int nIdTask, int nIdUnit, Plugin plugin )
    {
        return _dao.findByPrimaryKey( nIdTask, nIdUnit, plugin );
    }

    /**
     * Delete.
     *
     * @param nIdTask            the task id
     * @param nIdUnit            the unit id
     * @param plugin            the plugin
     */
    public void delete( int nIdTask, int nIdUnit, Plugin plugin )
    {
        _dao.delete( nIdTask, nIdUnit, plugin );
    }

    /**
     * Find by id task.
     *
     * @param nIdTask            the task id
     * @param plugin            the plugin
     * @return the list of WebServiceSignalementTaskConfigUnit
     */
    public List<WebServiceSignalementTaskConfigUnit> findByIdTask( int nIdTask, Plugin plugin )
    {
        return _dao.findByIdTask( nIdTask, plugin );
    }

    /**
     * Delete all.
     *
     * @param nIdTask            the task id
     * @param plugin            the plugin
     */
    public void deleteAll( int nIdTask, Plugin plugin )
    {
        _dao.deleteAll( nIdTask, plugin );
    }

    /**
     * Find by unit.
     *
     * @param nIdUnit            the id unit
     * @param plugin            the plugin
     * @return the WebServiceSignalementTaskConfigUnit
     */
    public List<WebServiceSignalementTaskConfigUnit> findByIdUnit( int nIdUnit, Plugin plugin )
    {
        return _dao.findByIdUnit( nIdUnit, plugin );
    }
}
