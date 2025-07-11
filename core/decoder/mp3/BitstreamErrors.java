/*
 * 11/19/04		1.0 moved to LGPL.
 * 11/17/04		INVALIDFRAME code added.	javalayer@javazoom.net
 * 12/12/99		Initial version.			mdm@techie.com
 *-----------------------------------------------------------------------
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */

package com.coloryr.allmusic.server.core.decoder.mp3;

/**
 * This interface describes all error codes that can be thrown
 * in <code>BistreamException</code>s.
 *
 * @author MDM        12/12/99
 * @see BitstreamException
 * @since 0.0.6
 */

public interface BitstreamErrors extends JavaLayerErrors {

    /**
     * An undeterminable error occurred.
     */
    int UNKNOWN_ERROR = BITSTREAM_ERROR;

    /**
     * A problem occurred reading from the stream.
     */
    int STREAM_ERROR = BITSTREAM_ERROR + 2;

    /**
     * The end of the stream was reached.
     */
    int STREAM_EOF = BITSTREAM_ERROR + 4;

    /**
     * Frame data are missing.
     */
    int INVALIDFRAME = BITSTREAM_ERROR + 5;

}
