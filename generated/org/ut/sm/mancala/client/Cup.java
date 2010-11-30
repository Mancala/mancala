/*
 * generated by Fujaba - CodeGen2
 */
package org.ut.sm.mancala.client;
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import javax.swing.JButton;


public class Cup extends JButton
{



   public  Cup (String label )
   {

      super(label);
      return ;
   }

   public int getStones ()
   {

      return Integer.parseInt(getText().trim());
   }

   /**
    * <pre>
    *           0..1     next     0..1
    * Cup ------------------------- Kahala
    *           cup               kahala
    * </pre>
    */
   public static final String PROPERTY_KAHALA = "kahala";

   @Property( name = PROPERTY_KAHALA, partner = Kahala.PROPERTY_CUP, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Kahala kahala;

   @Property( name = PROPERTY_KAHALA )
   public boolean setKahala (Kahala value)
   {
      boolean changed = false;

      if (this.kahala != value)
      {
      
         Kahala oldValue = this.kahala;
         Cup source = this;
         if (this.kahala != null)
         {
            this.kahala = null;
            oldValue.setCup (null);
         }
         this.kahala = value;

         if (value != null)
         {
            value.setCup (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_KAHALA )
   public Cup withKahala (Kahala value)
   {
      setKahala (value);
      return this;
   }

   public Kahala getKahala ()
   {
      return this.kahala;
   }

   /**
    * <pre>
    *           0..1     next     0..1
    * Cup ------------------------- Cup
    *           rightCup               leftCup
    * </pre>
    */
   public static final String PROPERTY_LEFT_CUP = "leftCup";

   @Property( name = PROPERTY_LEFT_CUP, partner = Cup.PROPERTY_RIGHT_CUP, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup leftCup;

   @Property( name = PROPERTY_LEFT_CUP )
   public boolean setLeftCup (Cup value)
   {
      boolean changed = false;

      if (this.leftCup != value)
      {
      
         Cup oldValue = this.leftCup;
         Cup source = this;
         if (this.leftCup != null)
         {
            this.leftCup = null;
            oldValue.setRightCup (null);
         }
         this.leftCup = value;

         if (value != null)
         {
            value.setRightCup (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_LEFT_CUP )
   public Cup withLeftCup (Cup value)
   {
      setLeftCup (value);
      return this;
   }

   public Cup getLeftCup ()
   {
      return this.leftCup;
   }

   public static final String PROPERTY_NUM_OFSTONES = "numOfstones";

   @Property( name = PROPERTY_NUM_OFSTONES, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private int numOfstones;

   @Property( name = PROPERTY_NUM_OFSTONES )
   public void setNumOfstones (int value)
   {
      this.numOfstones = value;
   }

   public Cup withNumOfstones (int value)
   {
      setNumOfstones (value);
      return this;
   }

   @Property( name = PROPERTY_NUM_OFSTONES )
   public int getNumOfstones ()
   {
      return this.numOfstones;
   }

   /**
    * <pre>
    *           6     has     1
    * Cup ------------------------- Player
    *           cup               player
    * </pre>
    */
   public static final String PROPERTY_PLAYER = "player";

   @Property( name = PROPERTY_PLAYER, partner = Player.PROPERTY_CUP, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Player player;

   @Property( name = PROPERTY_PLAYER )
   public boolean setPlayer (Player value)
   {
      boolean changed = false;

      if (this.player != value)
      {
      
         Player oldValue = this.player;
         Cup source = this;
         if (this.player != null)
         {
            this.player = null;
            oldValue.removeFromCup (this);
         }
         this.player = value;

         if (value != null)
         {
            value.addToCup (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_PLAYER )
   public Cup withPlayer (Player value)
   {
      setPlayer (value);
      return this;
   }

   public Player getPlayer ()
   {
      return this.player;
   }

   /**
    * <pre>
    *           0..1     next     0..1
    * Cup ------------------------- Cup
    *           leftCup               rightCup
    * </pre>
    */
   public static final String PROPERTY_RIGHT_CUP = "rightCup";

   @Property( name = PROPERTY_RIGHT_CUP, partner = Cup.PROPERTY_LEFT_CUP, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup rightCup;

   @Property( name = PROPERTY_RIGHT_CUP )
   public boolean setRightCup (Cup value)
   {
      boolean changed = false;

      if (this.rightCup != value)
      {
      
         Cup oldValue = this.rightCup;
         Cup source = this;
         if (this.rightCup != null)
         {
            this.rightCup = null;
            oldValue.setLeftCup (null);
         }
         this.rightCup = value;

         if (value != null)
         {
            value.setLeftCup (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_RIGHT_CUP )
   public Cup withRightCup (Cup value)
   {
      setRightCup (value);
      return this;
   }

   public Cup getRightCup ()
   {
      return this.rightCup;
   }

   public void setStones (int stones )
   {
      boolean fujaba__Success = false;

      // story pattern storypatternwithparams
      try 
      {
         fujaba__Success = false; 

         // collabStat call
         this.setText( Integer.toString(stones));;
         // collabStat call
         this.numOfstones =  stones;;
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      return ;
   }

   public void removeYou()
   {
      this.setKahala (null);
      this.setLeftCup (null);
      this.setPlayer (null);
      this.setRightCup (null);
   }
}


