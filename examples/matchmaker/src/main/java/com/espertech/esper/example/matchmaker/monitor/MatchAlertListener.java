/**************************************************************************************
 * Copyright (C) 2006-2015 EsperTech Inc. All rights reserved.                        *
 * http://www.espertech.com/esper                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.example.matchmaker.monitor;

import java.util.List;
import java.util.LinkedList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.espertech.esper.example.matchmaker.eventbean.MatchAlertBean;

public class MatchAlertListener
{
    private List<MatchAlertBean> emittedList = new LinkedList<MatchAlertBean>();

    public void emitted(MatchAlertBean object)
    {
        log.info(".emitted Emitted object=" + object);
        emittedList.add(object);
    }

    public int getSize()
    {
        return emittedList.size();
    }

    public List getEmittedList()
    {
        return emittedList;
    }

    public int getAndClearEmittedCount()
    {
        int count = emittedList.size();
        emittedList.clear();
        return count;
    }

    public void clearEmitted()
    {
        emittedList.clear();
    }

    private static final Log log = LogFactory.getLog(MatchAlertListener.class);
}
