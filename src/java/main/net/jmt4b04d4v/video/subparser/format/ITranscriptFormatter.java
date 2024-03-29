/**
 * 
 */
package net.jmt4b04d4v.video.subparser.format;

import net.jmt4b04d4v.video.subparser.model.ICaption;
import net.jmt4b04d4v.video.subparser.model.ITranscript;

/**
 * <p>Copyright (C) 2008 Johans Marvin Taboada Villca &lt;jmt4b04d4v at gmail 
 * dot com></p>
 * <p>This file is part of google-video-subtitles-parser.</p>
 * <p>google-video-subtitles-parser is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.</p>
 * <p>google-video-subtitles-parser is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser 
 * General Public License for more details.</p>
 * <p>You should have received a copy of the GNU Lesser General Public License 
 * along with google-video-subtitles-parser. If not, see 
 * <a href="http://www.gnu.org/licenses/">http://www.gnu.org/licenses/</a>.</p>
 * <p><code>ITranscriptFormatter</code> is a common interface that exposes the 
 * common behavior of every transcript formatter, that is:.</p>
 * <ul>
 * <li><b>Format transcript document</b>. Translate source transcript to the 
 * target subtitle file format.</li>
 * <li><b>Format caption</b>. Translate caption (part of a transcript) to the 
 * target subtitle file format.</li>
 * <li><b>Parse string into transcript (inverse of format)</b>. Mostly 
 * unimplemented, maybe someone needs this?</li>
 * </ul>
 * 
 * @see      net.jmt4b04d4v.video.subparser.format.AbstractTranscriptFormatter
 * @see      net.jmt4b04d4v.video.subparser.format.SubRipTranscriptFormatter
 * @see      net.jmt4b04d4v.video.subparser.format.SubStationAlphaTranscriptFormatter
 * @version  M1 2008/09/04
 * @author   Johans Marvin Taboada Villca &lt;jmt4b04d4v at gmail dot com>
 */
public interface ITranscriptFormatter {

    /**
     * Format transcript object to String representation and append to buffer.
     * 
     * @param transcript Transcript to format.
     * @param toAppendTo Buffer to append result.
     * @return Buffer with original contents and appended data.
     */
    StringBuffer format(ITranscript transcript, StringBuffer toAppendTo);
    
    /**
     * Format caption object to String representation and append to buffer.
     * 
     * @param caption Caption to format.
     * @param toAppendTo Buffer to append result.
     * @return Buffer with original contents and appended data.
     */
    StringBuffer formatCaption(ICaption caption, StringBuffer toAppendTo);
    
    /**
     * Parse input string into Transcript object representation.
     * 
     * @param input A string representation of the captions collection.
     * @return A Transcript object value of the String representation.
     */
    ITranscript parse(String input);
}
