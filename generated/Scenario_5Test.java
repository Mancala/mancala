/*
 * generated by Fujaba - CodeGen2
 */
import org.ut.sm.mancala.client.Player;
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import org.ut.sm.mancala.client.Game;
import org.ut.sm.mancala.client.Cup;
import org.ut.sm.mancala.client.Kahala;
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import junit.framework.AssertionFailedError;
import java.io.PrintWriter;
import java.io.StringWriter;
import junit.framework.TestCase;


public class Scenario_5Test extends TestCase
{



   /**
    * <pre>
    *           0..1     object_Alex     0..1
    * Scenario_5Test ------------------------> Player
    *           test               Alex
    * </pre>
    */
   public static final String PROPERTY_ALEX = "Alex";

   @Property( name = PROPERTY_ALEX, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Player Alex;

   @Property( name = PROPERTY_ALEX )
   public boolean setAlex (Player value)
   {
      boolean changed = false;

      if (this.Alex != value)
      {
      
         Player oldValue = this.Alex;
         this.Alex = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_ALEX )
   public Scenario_5Test withAlex (Player value)
   {
      setAlex (value);
      return this;
   }

   public Player getAlex ()
   {
      return this.Alex;
   }

   /**
    * <pre>
    *           0..1     object_Game     0..1
    * Scenario_5Test ------------------------> Game
    *           test               Game
    * </pre>
    */
   public static final String PROPERTY_GAME = "Game";

   @Property( name = PROPERTY_GAME, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Game Game;

   @Property( name = PROPERTY_GAME )
   public boolean setGame (Game value)
   {
      boolean changed = false;

      if (this.Game != value)
      {
      
         Game oldValue = this.Game;
         this.Game = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_GAME )
   public Scenario_5Test withGame (Game value)
   {
      setGame (value);
      return this;
   }

   public Game getGame ()
   {
      return this.Game;
   }

   /**
    * <pre>
    *           0..1     object_Lisa     0..1
    * Scenario_5Test ------------------------> Player
    *           test               Lisa
    * </pre>
    */
   public static final String PROPERTY_LISA = "Lisa";

   @Property( name = PROPERTY_LISA, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Player Lisa;

   @Property( name = PROPERTY_LISA )
   public boolean setLisa (Player value)
   {
      boolean changed = false;

      if (this.Lisa != value)
      {
      
         Player oldValue = this.Lisa;
         this.Lisa = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_LISA )
   public Scenario_5Test withLisa (Player value)
   {
      setLisa (value);
      return this;
   }

   public Player getLisa ()
   {
      return this.Lisa;
   }

   /**
    * <pre>
    *           0..1     object_aCup1     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup1
    * </pre>
    */
   public static final String PROPERTY_A_CUP1 = "aCup1";

   @Property( name = PROPERTY_A_CUP1, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup1;

   @Property( name = PROPERTY_A_CUP1 )
   public boolean setACup1 (Cup value)
   {
      boolean changed = false;

      if (this.aCup1 != value)
      {
      
         Cup oldValue = this.aCup1;
         this.aCup1 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP1 )
   public Scenario_5Test withACup1 (Cup value)
   {
      setACup1 (value);
      return this;
   }

   public Cup getACup1 ()
   {
      return this.aCup1;
   }

   /**
    * <pre>
    *           0..1     object_aCup2     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup2
    * </pre>
    */
   public static final String PROPERTY_A_CUP2 = "aCup2";

   @Property( name = PROPERTY_A_CUP2, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup2;

   @Property( name = PROPERTY_A_CUP2 )
   public boolean setACup2 (Cup value)
   {
      boolean changed = false;

      if (this.aCup2 != value)
      {
      
         Cup oldValue = this.aCup2;
         this.aCup2 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP2 )
   public Scenario_5Test withACup2 (Cup value)
   {
      setACup2 (value);
      return this;
   }

   public Cup getACup2 ()
   {
      return this.aCup2;
   }

   /**
    * <pre>
    *           0..1     object_aCup3     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup3
    * </pre>
    */
   public static final String PROPERTY_A_CUP3 = "aCup3";

   @Property( name = PROPERTY_A_CUP3, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup3;

   @Property( name = PROPERTY_A_CUP3 )
   public boolean setACup3 (Cup value)
   {
      boolean changed = false;

      if (this.aCup3 != value)
      {
      
         Cup oldValue = this.aCup3;
         this.aCup3 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP3 )
   public Scenario_5Test withACup3 (Cup value)
   {
      setACup3 (value);
      return this;
   }

   public Cup getACup3 ()
   {
      return this.aCup3;
   }

   /**
    * <pre>
    *           0..1     object_aCup4     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup4
    * </pre>
    */
   public static final String PROPERTY_A_CUP4 = "aCup4";

   @Property( name = PROPERTY_A_CUP4, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup4;

   @Property( name = PROPERTY_A_CUP4 )
   public boolean setACup4 (Cup value)
   {
      boolean changed = false;

      if (this.aCup4 != value)
      {
      
         Cup oldValue = this.aCup4;
         this.aCup4 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP4 )
   public Scenario_5Test withACup4 (Cup value)
   {
      setACup4 (value);
      return this;
   }

   public Cup getACup4 ()
   {
      return this.aCup4;
   }

   /**
    * <pre>
    *           0..1     object_aCup5     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup5
    * </pre>
    */
   public static final String PROPERTY_A_CUP5 = "aCup5";

   @Property( name = PROPERTY_A_CUP5, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup5;

   @Property( name = PROPERTY_A_CUP5 )
   public boolean setACup5 (Cup value)
   {
      boolean changed = false;

      if (this.aCup5 != value)
      {
      
         Cup oldValue = this.aCup5;
         this.aCup5 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP5 )
   public Scenario_5Test withACup5 (Cup value)
   {
      setACup5 (value);
      return this;
   }

   public Cup getACup5 ()
   {
      return this.aCup5;
   }

   /**
    * <pre>
    *           0..1     object_aCup6     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               aCup6
    * </pre>
    */
   public static final String PROPERTY_A_CUP6 = "aCup6";

   @Property( name = PROPERTY_A_CUP6, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup aCup6;

   @Property( name = PROPERTY_A_CUP6 )
   public boolean setACup6 (Cup value)
   {
      boolean changed = false;

      if (this.aCup6 != value)
      {
      
         Cup oldValue = this.aCup6;
         this.aCup6 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_CUP6 )
   public Scenario_5Test withACup6 (Cup value)
   {
      setACup6 (value);
      return this;
   }

   public Cup getACup6 ()
   {
      return this.aCup6;
   }

   /**
    * <pre>
    *           0..1     object_aMancala     0..1
    * Scenario_5Test ------------------------> Kahala
    *           test               aMancala
    * </pre>
    */
   public static final String PROPERTY_A_MANCALA = "aMancala";

   @Property( name = PROPERTY_A_MANCALA, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Kahala aMancala;

   @Property( name = PROPERTY_A_MANCALA )
   public boolean setAMancala (Kahala value)
   {
      boolean changed = false;

      if (this.aMancala != value)
      {
      
         Kahala oldValue = this.aMancala;
         this.aMancala = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_A_MANCALA )
   public Scenario_5Test withAMancala (Kahala value)
   {
      setAMancala (value);
      return this;
   }

   public Kahala getAMancala ()
   {
      return this.aMancala;
   }

   public void assertStep1 ()
   {
      boolean fujaba__Success = false;
      Kahala aMancala = null;
      Cup aCup6 = null;

      // // result situation: 
      // story pattern 
      try 
      {
         fujaba__Success = false; 

         // check object Alex is really bound
         JavaSDM.ensure ( Alex != null, "check object Alex is really bound" );
         // check object Game is really bound
         JavaSDM.ensure ( Game != null, "check object Game is really bound" );
         // check object Lisa is really bound
         JavaSDM.ensure ( Lisa != null, "check object Lisa is really bound" );
         // check object aCup1 is really bound
         JavaSDM.ensure ( aCup1 != null, "check object aCup1 is really bound" );
         // check object aCup2 is really bound
         JavaSDM.ensure ( aCup2 != null, "check object aCup2 is really bound" );
         // check object aCup3 is really bound
         JavaSDM.ensure ( aCup3 != null, "check object aCup3 is really bound" );
         // check object aCup4 is really bound
         JavaSDM.ensure ( aCup4 != null, "check object aCup4 is really bound" );
         // check object aCup5 is really bound
         JavaSDM.ensure ( aCup5 != null, "check object aCup5 is really bound" );
         // check object aCup5 is really bound
         JavaSDM.ensure ( aCup5 != null, "check object aCup5 is really bound" );
         // check object lCup1 is really bound
         JavaSDM.ensure ( lCup1 != null, "check object lCup1 is really bound" );
         // check object lCup2 is really bound
         JavaSDM.ensure ( lCup2 != null, "check object lCup2 is really bound" );
         // check object lCup3 is really bound
         JavaSDM.ensure ( lCup3 != null, "check object lCup3 is really bound" );
         // check object lCup4 is really bound
         JavaSDM.ensure ( lCup4 != null, "check object lCup4 is really bound" );
         // check object lCup6 is really bound
         JavaSDM.ensure ( lCup6 != null, "check object lCup6 is really bound" );
         // check object lMancala is really bound
         JavaSDM.ensure ( lMancala != null, "check object lMancala is really bound" );
         // check isomorphic binding between objects Lisa and Alex
         JavaSDM.ensure ( !Lisa.equals (Alex), "check isomorphic binding between objects Lisa and Alex" );

         // check isomorphic binding between objects aCup2 and aCup1
         JavaSDM.ensure ( !aCup2.equals (aCup1), "check isomorphic binding between objects aCup2 and aCup1" );

         // check isomorphic binding between objects aCup3 and aCup1
         JavaSDM.ensure ( !aCup3.equals (aCup1), "check isomorphic binding between objects aCup3 and aCup1" );

         // check isomorphic binding between objects aCup4 and aCup1
         JavaSDM.ensure ( !aCup4.equals (aCup1), "check isomorphic binding between objects aCup4 and aCup1" );

         // check isomorphic binding between objects aCup5 and aCup1
         JavaSDM.ensure ( !aCup5.equals (aCup1), "check isomorphic binding between objects aCup5 and aCup1" );

         // check isomorphic binding between objects aCup5 and aCup1
         JavaSDM.ensure ( !aCup5.equals (aCup1), "check isomorphic binding between objects aCup5 and aCup1" );

         // check isomorphic binding between objects lCup1 and aCup1
         JavaSDM.ensure ( !lCup1.equals (aCup1), "check isomorphic binding between objects lCup1 and aCup1" );

         // check isomorphic binding between objects lCup2 and aCup1
         JavaSDM.ensure ( !lCup2.equals (aCup1), "check isomorphic binding between objects lCup2 and aCup1" );

         // check isomorphic binding between objects lCup3 and aCup1
         JavaSDM.ensure ( !lCup3.equals (aCup1), "check isomorphic binding between objects lCup3 and aCup1" );

         // check isomorphic binding between objects lCup4 and aCup1
         JavaSDM.ensure ( !lCup4.equals (aCup1), "check isomorphic binding between objects lCup4 and aCup1" );

         // check isomorphic binding between objects lCup6 and aCup1
         JavaSDM.ensure ( !lCup6.equals (aCup1), "check isomorphic binding between objects lCup6 and aCup1" );

         // check isomorphic binding between objects aCup3 and aCup2
         JavaSDM.ensure ( !aCup3.equals (aCup2), "check isomorphic binding between objects aCup3 and aCup2" );

         // check isomorphic binding between objects aCup4 and aCup2
         JavaSDM.ensure ( !aCup4.equals (aCup2), "check isomorphic binding between objects aCup4 and aCup2" );

         // check isomorphic binding between objects aCup5 and aCup2
         JavaSDM.ensure ( !aCup5.equals (aCup2), "check isomorphic binding between objects aCup5 and aCup2" );

         // check isomorphic binding between objects aCup5 and aCup2
         JavaSDM.ensure ( !aCup5.equals (aCup2), "check isomorphic binding between objects aCup5 and aCup2" );

         // check isomorphic binding between objects lCup1 and aCup2
         JavaSDM.ensure ( !lCup1.equals (aCup2), "check isomorphic binding between objects lCup1 and aCup2" );

         // check isomorphic binding between objects lCup2 and aCup2
         JavaSDM.ensure ( !lCup2.equals (aCup2), "check isomorphic binding between objects lCup2 and aCup2" );

         // check isomorphic binding between objects lCup3 and aCup2
         JavaSDM.ensure ( !lCup3.equals (aCup2), "check isomorphic binding between objects lCup3 and aCup2" );

         // check isomorphic binding between objects lCup4 and aCup2
         JavaSDM.ensure ( !lCup4.equals (aCup2), "check isomorphic binding between objects lCup4 and aCup2" );

         // check isomorphic binding between objects lCup6 and aCup2
         JavaSDM.ensure ( !lCup6.equals (aCup2), "check isomorphic binding between objects lCup6 and aCup2" );

         // check isomorphic binding between objects aCup4 and aCup3
         JavaSDM.ensure ( !aCup4.equals (aCup3), "check isomorphic binding between objects aCup4 and aCup3" );

         // check isomorphic binding between objects aCup5 and aCup3
         JavaSDM.ensure ( !aCup5.equals (aCup3), "check isomorphic binding between objects aCup5 and aCup3" );

         // check isomorphic binding between objects aCup5 and aCup3
         JavaSDM.ensure ( !aCup5.equals (aCup3), "check isomorphic binding between objects aCup5 and aCup3" );

         // check isomorphic binding between objects lCup1 and aCup3
         JavaSDM.ensure ( !lCup1.equals (aCup3), "check isomorphic binding between objects lCup1 and aCup3" );

         // check isomorphic binding between objects lCup2 and aCup3
         JavaSDM.ensure ( !lCup2.equals (aCup3), "check isomorphic binding between objects lCup2 and aCup3" );

         // check isomorphic binding between objects lCup3 and aCup3
         JavaSDM.ensure ( !lCup3.equals (aCup3), "check isomorphic binding between objects lCup3 and aCup3" );

         // check isomorphic binding between objects lCup4 and aCup3
         JavaSDM.ensure ( !lCup4.equals (aCup3), "check isomorphic binding between objects lCup4 and aCup3" );

         // check isomorphic binding between objects lCup6 and aCup3
         JavaSDM.ensure ( !lCup6.equals (aCup3), "check isomorphic binding between objects lCup6 and aCup3" );

         // check isomorphic binding between objects aCup5 and aCup4
         JavaSDM.ensure ( !aCup5.equals (aCup4), "check isomorphic binding between objects aCup5 and aCup4" );

         // check isomorphic binding between objects aCup5 and aCup4
         JavaSDM.ensure ( !aCup5.equals (aCup4), "check isomorphic binding between objects aCup5 and aCup4" );

         // check isomorphic binding between objects lCup1 and aCup4
         JavaSDM.ensure ( !lCup1.equals (aCup4), "check isomorphic binding between objects lCup1 and aCup4" );

         // check isomorphic binding between objects lCup2 and aCup4
         JavaSDM.ensure ( !lCup2.equals (aCup4), "check isomorphic binding between objects lCup2 and aCup4" );

         // check isomorphic binding between objects lCup3 and aCup4
         JavaSDM.ensure ( !lCup3.equals (aCup4), "check isomorphic binding between objects lCup3 and aCup4" );

         // check isomorphic binding between objects lCup4 and aCup4
         JavaSDM.ensure ( !lCup4.equals (aCup4), "check isomorphic binding between objects lCup4 and aCup4" );

         // check isomorphic binding between objects lCup6 and aCup4
         JavaSDM.ensure ( !lCup6.equals (aCup4), "check isomorphic binding between objects lCup6 and aCup4" );

         // check isomorphic binding between objects aCup5 and aCup5
         JavaSDM.ensure ( !aCup5.equals (aCup5), "check isomorphic binding between objects aCup5 and aCup5" );

         // check isomorphic binding between objects lCup1 and aCup5
         JavaSDM.ensure ( !lCup1.equals (aCup5), "check isomorphic binding between objects lCup1 and aCup5" );

         // check isomorphic binding between objects lCup1 and aCup5
         JavaSDM.ensure ( !lCup1.equals (aCup5), "check isomorphic binding between objects lCup1 and aCup5" );

         // check isomorphic binding between objects lCup2 and aCup5
         JavaSDM.ensure ( !lCup2.equals (aCup5), "check isomorphic binding between objects lCup2 and aCup5" );

         // check isomorphic binding between objects lCup2 and aCup5
         JavaSDM.ensure ( !lCup2.equals (aCup5), "check isomorphic binding between objects lCup2 and aCup5" );

         // check isomorphic binding between objects lCup3 and aCup5
         JavaSDM.ensure ( !lCup3.equals (aCup5), "check isomorphic binding between objects lCup3 and aCup5" );

         // check isomorphic binding between objects lCup3 and aCup5
         JavaSDM.ensure ( !lCup3.equals (aCup5), "check isomorphic binding between objects lCup3 and aCup5" );

         // check isomorphic binding between objects lCup4 and aCup5
         JavaSDM.ensure ( !lCup4.equals (aCup5), "check isomorphic binding between objects lCup4 and aCup5" );

         // check isomorphic binding between objects lCup4 and aCup5
         JavaSDM.ensure ( !lCup4.equals (aCup5), "check isomorphic binding between objects lCup4 and aCup5" );

         // check isomorphic binding between objects lCup6 and aCup5
         JavaSDM.ensure ( !lCup6.equals (aCup5), "check isomorphic binding between objects lCup6 and aCup5" );

         // check isomorphic binding between objects lCup6 and aCup5
         JavaSDM.ensure ( !lCup6.equals (aCup5), "check isomorphic binding between objects lCup6 and aCup5" );

         // check isomorphic binding between objects lCup2 and lCup1
         JavaSDM.ensure ( !lCup2.equals (lCup1), "check isomorphic binding between objects lCup2 and lCup1" );

         // check isomorphic binding between objects lCup3 and lCup1
         JavaSDM.ensure ( !lCup3.equals (lCup1), "check isomorphic binding between objects lCup3 and lCup1" );

         // check isomorphic binding between objects lCup4 and lCup1
         JavaSDM.ensure ( !lCup4.equals (lCup1), "check isomorphic binding between objects lCup4 and lCup1" );

         // check isomorphic binding between objects lCup6 and lCup1
         JavaSDM.ensure ( !lCup6.equals (lCup1), "check isomorphic binding between objects lCup6 and lCup1" );

         // check isomorphic binding between objects lCup3 and lCup2
         JavaSDM.ensure ( !lCup3.equals (lCup2), "check isomorphic binding between objects lCup3 and lCup2" );

         // check isomorphic binding between objects lCup4 and lCup2
         JavaSDM.ensure ( !lCup4.equals (lCup2), "check isomorphic binding between objects lCup4 and lCup2" );

         // check isomorphic binding between objects lCup6 and lCup2
         JavaSDM.ensure ( !lCup6.equals (lCup2), "check isomorphic binding between objects lCup6 and lCup2" );

         // check isomorphic binding between objects lCup4 and lCup3
         JavaSDM.ensure ( !lCup4.equals (lCup3), "check isomorphic binding between objects lCup4 and lCup3" );

         // check isomorphic binding between objects lCup6 and lCup3
         JavaSDM.ensure ( !lCup6.equals (lCup3), "check isomorphic binding between objects lCup6 and lCup3" );

         // check isomorphic binding between objects lCup6 and lCup4
         JavaSDM.ensure ( !lCup6.equals (lCup4), "check isomorphic binding between objects lCup6 and lCup4" );

         // check link has from Lisa to lMancala
         JavaSDM.ensure (lMancala.equals (Lisa.getKahala ()), "check link has from Lisa to lMancala");

         // check link next from aCup2 to aCup1
         JavaSDM.ensure (aCup1.equals (aCup2.getLeftCup ()), "check link next from aCup2 to aCup1");

         // check link next from aCup3 to aCup2
         JavaSDM.ensure (aCup2.equals (aCup3.getLeftCup ()), "check link next from aCup3 to aCup2");

         // check link next from aCup4 to aCup3
         JavaSDM.ensure (aCup3.equals (aCup4.getLeftCup ()), "check link next from aCup4 to aCup3");

         // check link next from aCup5 to aCup4
         JavaSDM.ensure (aCup4.equals (aCup5.getLeftCup ()), "check link next from aCup5 to aCup4");

         // check link next from lCup6 to aCup5
         JavaSDM.ensure (aCup5.equals (lCup6.getLeftCup ()), "check link next from lCup6 to aCup5");

         // check link next from lCup2 to lCup1
         JavaSDM.ensure (lCup1.equals (lCup2.getLeftCup ()), "check link next from lCup2 to lCup1");

         // check link next from lCup3 to lCup2
         JavaSDM.ensure (lCup2.equals (lCup3.getLeftCup ()), "check link next from lCup3 to lCup2");

         // check link next from lCup4 to lCup3
         JavaSDM.ensure (lCup3.equals (lCup4.getLeftCup ()), "check link next from lCup4 to lCup3");

         // check link next from aCup5 to lCup4
         JavaSDM.ensure (lCup4.equals (aCup5.getLeftCup ()), "check link next from aCup5 to lCup4");

         // check link next from lCup6 to aCup1
         JavaSDM.ensure (aCup1.equals (lCup6.getRightCup ()), "check link next from lCup6 to aCup1");

         // check link next from lCup6 to lMancala
         JavaSDM.ensure (lMancala.equals (lCup6.getKahala ()), "check link next from lCup6 to lMancala");

         // check link isActive from Game to Alex
         JavaSDM.ensure (Alex.equals (Game.getIsActive ()), "check link isActive from Game to Alex");

         // destroy link isActive from Game to Alex
         Game.setIsActive (null);
         // create object aMancala
         aMancala = new Kahala("24");

         // create object aCup6
         aCup6 = new Cup("0");

         // create link has from aMancala to Alex
         aMancala.setPlayer (Alex);

         // create link next from lCup1 to aCup6
         lCup1.setLeftCup (aCup6);

         // create link next from aMancala to aCup6
         aMancala.setCup (aCup6);

         // create link next from aCup5 to aCup6
         aCup5.setRightCup (aCup6);

         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
         StringWriter fujaba_StringWriter = new StringWriter();
         PrintWriter fujaba_PrintWriter = new PrintWriter(fujaba_StringWriter);
         fujaba__InternalException.printStackTrace(fujaba_PrintWriter);
         int length = fujaba__InternalException.getClass().getName().length() + 2;
         AssertionFailedError fujaba_AssertionFailedError = new AssertionFailedError(fujaba_StringWriter.toString().substring(length));
         fujaba_AssertionFailedError.setStackTrace(new StackTraceElement[] {});
         throw fujaba_AssertionFailedError;
      }

   }

   /**
    * <pre>
    *           0..1     object_lCup1     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup1
    * </pre>
    */
   public static final String PROPERTY_L_CUP1 = "lCup1";

   @Property( name = PROPERTY_L_CUP1, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup1;

   @Property( name = PROPERTY_L_CUP1 )
   public boolean setLCup1 (Cup value)
   {
      boolean changed = false;

      if (this.lCup1 != value)
      {
      
         Cup oldValue = this.lCup1;
         this.lCup1 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP1 )
   public Scenario_5Test withLCup1 (Cup value)
   {
      setLCup1 (value);
      return this;
   }

   public Cup getLCup1 ()
   {
      return this.lCup1;
   }

   /**
    * <pre>
    *           0..1     object_lCup2     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup2
    * </pre>
    */
   public static final String PROPERTY_L_CUP2 = "lCup2";

   @Property( name = PROPERTY_L_CUP2, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup2;

   @Property( name = PROPERTY_L_CUP2 )
   public boolean setLCup2 (Cup value)
   {
      boolean changed = false;

      if (this.lCup2 != value)
      {
      
         Cup oldValue = this.lCup2;
         this.lCup2 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP2 )
   public Scenario_5Test withLCup2 (Cup value)
   {
      setLCup2 (value);
      return this;
   }

   public Cup getLCup2 ()
   {
      return this.lCup2;
   }

   /**
    * <pre>
    *           0..1     object_lCup3     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup3
    * </pre>
    */
   public static final String PROPERTY_L_CUP3 = "lCup3";

   @Property( name = PROPERTY_L_CUP3, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup3;

   @Property( name = PROPERTY_L_CUP3 )
   public boolean setLCup3 (Cup value)
   {
      boolean changed = false;

      if (this.lCup3 != value)
      {
      
         Cup oldValue = this.lCup3;
         this.lCup3 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP3 )
   public Scenario_5Test withLCup3 (Cup value)
   {
      setLCup3 (value);
      return this;
   }

   public Cup getLCup3 ()
   {
      return this.lCup3;
   }

   /**
    * <pre>
    *           0..1     object_lCup4     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup4
    * </pre>
    */
   public static final String PROPERTY_L_CUP4 = "lCup4";

   @Property( name = PROPERTY_L_CUP4, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup4;

   @Property( name = PROPERTY_L_CUP4 )
   public boolean setLCup4 (Cup value)
   {
      boolean changed = false;

      if (this.lCup4 != value)
      {
      
         Cup oldValue = this.lCup4;
         this.lCup4 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP4 )
   public Scenario_5Test withLCup4 (Cup value)
   {
      setLCup4 (value);
      return this;
   }

   public Cup getLCup4 ()
   {
      return this.lCup4;
   }

   /**
    * <pre>
    *           0..1     object_lCup5     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup5
    * </pre>
    */
   public static final String PROPERTY_L_CUP5 = "lCup5";

   @Property( name = PROPERTY_L_CUP5, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup5;

   @Property( name = PROPERTY_L_CUP5 )
   public boolean setLCup5 (Cup value)
   {
      boolean changed = false;

      if (this.lCup5 != value)
      {
      
         Cup oldValue = this.lCup5;
         this.lCup5 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP5 )
   public Scenario_5Test withLCup5 (Cup value)
   {
      setLCup5 (value);
      return this;
   }

   public Cup getLCup5 ()
   {
      return this.lCup5;
   }

   /**
    * <pre>
    *           0..1     object_lCup6     0..1
    * Scenario_5Test ------------------------> Cup
    *           test               lCup6
    * </pre>
    */
   public static final String PROPERTY_L_CUP6 = "lCup6";

   @Property( name = PROPERTY_L_CUP6, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Cup lCup6;

   @Property( name = PROPERTY_L_CUP6 )
   public boolean setLCup6 (Cup value)
   {
      boolean changed = false;

      if (this.lCup6 != value)
      {
      
         Cup oldValue = this.lCup6;
         this.lCup6 = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_CUP6 )
   public Scenario_5Test withLCup6 (Cup value)
   {
      setLCup6 (value);
      return this;
   }

   public Cup getLCup6 ()
   {
      return this.lCup6;
   }

   /**
    * <pre>
    *           0..1     object_lMancala     0..1
    * Scenario_5Test ------------------------> Kahala
    *           test               lMancala
    * </pre>
    */
   public static final String PROPERTY_L_MANCALA = "lMancala";

   @Property( name = PROPERTY_L_MANCALA, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Kahala lMancala;

   @Property( name = PROPERTY_L_MANCALA )
   public boolean setLMancala (Kahala value)
   {
      boolean changed = false;

      if (this.lMancala != value)
      {
      
         Kahala oldValue = this.lMancala;
         this.lMancala = value;
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_L_MANCALA )
   public Scenario_5Test withLMancala (Kahala value)
   {
      setLMancala (value);
      return this;
   }

   public Kahala getLMancala ()
   {
      return this.lMancala;
   }

   public void setUp ()
   {
      boolean fujaba__Success = false;
      Player Lisa = null;
      Kahala lMancala = null;
      Cup lCup6 = null;
      Cup aCup1 = null;
      Cup aCup2 = null;
      Cup aCup3 = null;
      Cup aCup4 = null;
      Player Alex = null;
      Kahala aMancala = null;
      Game Game = null;
      Cup aCup6 = null;
      Cup lCup1 = null;
      Cup lCup2 = null;
      Cup lCup3 = null;
      Cup lCup4 = null;
      Cup lCup5 = null;
      Cup aCup5 = null;

      // // start situation: 
      // story pattern 
      try 
      {
         fujaba__Success = false; 

         // create object Lisa
         Lisa = new Player("Lisa");

         // create object lMancala
         lMancala = new Kahala("21");

         // create object lCup6
         lCup6 = new Cup("0");

         // create object aCup1
         aCup1 = new Cup("0");

         // create object aCup2
         aCup2 = new Cup("0");

         // create object aCup3
         aCup3 = new Cup("0");

         // create object aCup4
         aCup4 = new Cup("0");

         // create object Alex
         Alex = new Player("Alex");

         // create object aMancala
         aMancala = new Kahala("23");

         // create object Game
         Game = Game.getInstance();

         // create object aCup6
         aCup6 = new Cup("1");

         // create object lCup1
         lCup1 = new Cup("0");

         // create object lCup2
         lCup2 = new Cup("0");

         // create object lCup3
         lCup3 = new Cup("0");

         // create object lCup4
         lCup4 = new Cup("3");

         // create object lCup5
         lCup5 = new Cup("0");

         // create object aCup5
         aCup5 = new Cup("0");

         // create link has from lMancala to Lisa
         lMancala.setPlayer (Lisa);

         // create link object_Lisa from this to Lisa
         this.setLisa (Lisa);

         // create link next from lCup6 to lMancala
         lCup6.setKahala (lMancala);

         // create link object_lMancala from this to lMancala
         this.setLMancala (lMancala);

         // create link next from aCup2 to aCup1
         aCup2.setLeftCup (aCup1);

         // create link next from lCup6 to aCup1
         lCup6.setRightCup (aCup1);

         // create link object_aCup1 from this to aCup1
         this.setACup1 (aCup1);

         // create link next from aCup3 to aCup2
         aCup3.setLeftCup (aCup2);

         // create link object_aCup2 from this to aCup2
         this.setACup2 (aCup2);

         // create link next from aCup4 to aCup3
         aCup4.setLeftCup (aCup3);

         // create link object_aCup3 from this to aCup3
         this.setACup3 (aCup3);

         // create link has from aMancala to Alex
         aMancala.setPlayer (Alex);

         // create link isActive from Game to Alex
         Game.setIsActive (Alex);

         // create link object_Alex from this to Alex
         this.setAlex (Alex);

         // create link next from aCup6 to aMancala
         aCup6.setKahala (aMancala);

         // create link object_aMancala from this to aMancala
         this.setAMancala (aMancala);

         // create link object_Game from this to Game
         this.setGame (Game);

         // create link next from lCup2 to lCup1
         lCup2.setLeftCup (lCup1);

         // create link next from aCup6 to lCup1
         aCup6.setRightCup (lCup1);

         // create link object_lCup1 from this to lCup1
         this.setLCup1 (lCup1);

         // create link next from lCup3 to lCup2
         lCup3.setLeftCup (lCup2);

         // create link object_lCup2 from this to lCup2
         this.setLCup2 (lCup2);

         // create link next from lCup4 to lCup3
         lCup4.setLeftCup (lCup3);

         // create link object_lCup3 from this to lCup3
         this.setLCup3 (lCup3);

         // create link next from lCup5 to lCup4
         lCup5.setLeftCup (lCup4);

         // create link object_lCup4 from this to lCup4
         this.setLCup4 (lCup4);

         // create link next from lCup6 to lCup5
         lCup6.setLeftCup (lCup5);

         // create link object_lCup5 from this to lCup5
         this.setLCup5 (lCup5);

         // create link object_lCup6 from this to lCup6
         this.setLCup6 (lCup6);

         // create link next from aCup5 to aCup6
         aCup5.setRightCup (aCup6);

         // create link object_aCup6 from this to aCup6
         this.setACup6 (aCup6);

         // create link next from aCup5 to aCup4
         aCup5.setLeftCup (aCup4);

         // create link object_aCup4 from this to aCup4
         this.setACup4 (aCup4);

         // create link object_aCup5 from this to aCup5
         this.setACup5 (aCup5);

         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

   }

   public void testScenario_5 ()
   {
      boolean fujaba__Success = false;

      // assert result situation
      // story pattern usecasestep
      try 
      {
         fujaba__Success = false; 

         // collabStat call
         this.assertStep1();
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

   }

   public void removeYou()
   {
      this.setAlex (null);
      this.setGame (null);
      this.setLisa (null);
      this.setACup1 (null);
      this.setACup2 (null);
      this.setACup3 (null);
      this.setACup4 (null);
      this.setACup5 (null);
      this.setACup6 (null);
      this.setAMancala (null);
      this.setLCup1 (null);
      this.setLCup2 (null);
      this.setLCup3 (null);
      this.setLCup4 (null);
      this.setLCup5 (null);
      this.setLCup6 (null);
      this.setLMancala (null);
   }
}


