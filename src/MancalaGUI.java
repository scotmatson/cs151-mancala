/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import javax.swing.*;
import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 The outer frame for a Mancala game. Bootstraps all necessary
 graphical components.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/10/26

 */
public class MancalaGUI extends JFrame
{
   private final String FRAME_TITLE = "This is Mancala, bitches.";

   public MancalaGUI()
   {
      // Define properties of the JFrame.
      setTitle(FRAME_TITLE);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setDefaultLookAndFeelDecorated(true);
      setJMenuBar(new MancalaMenuBar());

      // Define the content of the JFrame.
      addComponentsToPane(getContentPane());

      // Display the window.
      pack();
      setVisible(true);
   }

   /**
    Places content within the JFrame.
    @param pane the content pane of a JFrame.
    */
   public void addComponentsToPane(Container pane)
   {

      pane.add(new StatusPane(1000, 150), BorderLayout.PAGE_START);
      pane.add(new GamePane(1000, 400), BorderLayout.PAGE_END);
   }
}
