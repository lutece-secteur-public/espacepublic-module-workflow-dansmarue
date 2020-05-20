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
package fr.paris.lutece.plugins.workflow.modules.dansmarue.task.notificationpush.business;


/**
 * The Class NotificationPushValue.
 */
public class NotificationPushValue
{
    
    /** The id resource history. */
    private int    _idResourceHistory;
    
    /** The id task. */
    private int    _idTask;
    
    /** The mobile notification value. */
    private String _mobileNotificationValue;

    /**
     * Gets the id resource history.
     *
     * @return the notification value id
     */
    public int getIdResourceHistory( )
    {
        return _idResourceHistory;
    }

    /**
     * the notification value id.
     *
     * @param id            the notification value id
     */
    public void setIdResourceHistory( int id )
    {
        _idResourceHistory = id;
    }

    /**
     * Gets the id task.
     *
     * @return the task id
     */
    public int getIdTask( )
    {
        return _idTask;
    }

    /**
     * the task id.
     *
     * @param idTask            the task id
     */
    public void setIdTask( int idTask )
    {
        this._idTask = idTask;
    }

    /**
     * Gets the mobile notification value.
     *
     * @return the mobileNotificationValue
     */
    public String getMobileNotificationValue( )
    {
        return _mobileNotificationValue;
    }

    /**
     * Sets the mobile notification value.
     *
     * @param mobileNotificationValue            the mobileNotificationValue to set
     */
    public void setMobileNotificationValue( String mobileNotificationValue )
    {
        this._mobileNotificationValue = mobileNotificationValue;
    }

}
