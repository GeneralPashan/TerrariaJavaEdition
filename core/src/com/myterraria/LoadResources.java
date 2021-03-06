package com.myterraria;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.myterraria.interfaces.FrameBuffer;
import com.myterraria.interfaces.Item;
import com.myterraria.interfaces.ItemManager;
import com.myterraria.interfaces.Value;
import engine.Assets;
import engine.tiledmap.TileManager;

public class LoadResources{

    public static void loadResources(){
        Pixmap pixmap=new Pixmap(1,1,Pixmap.Format.RGBA4444);
        pixmap.setColor(0,0,0,1);
        pixmap.fill();
        Assets.loadTexture(new Texture(pixmap),"black_pixel");

        //FONTS

        Assets.loadTTF("fonts/FiraCode.ttf","font1",48,new Color(1,1,1,1));
        Assets.loadTTF("fonts/FiraCodeBold.ttf","font2",32,new Color(0.5f,0.5f,0.5f,1));
        Assets.loadTTF("fonts/andy_bold.ttf","font3",32,new Color(0.5f,0.5f,0.5f,1));
        Assets.loadTTF("fonts/minecraft.ttf","font4",32,new Color(0.5f,0.5f,0.5f,1));
        Assets.loadTTF("fonts/standart.ttf","font5",32,new Color(0.5f,0.5f,0.5f,1));

        //BACKGROUNDS

        Assets.loadTexture("background/Background_0.png","Background_0");

        //UI

        Assets.loadTexture("ui/Inventory_Back.png","Inventory_Back");
        Assets.loadTexture("ui/Inventory_Back7.png","Inventory_Back7");
        Assets.loadTexture("ui/Inventory_Back10.png","Inventory_Back10");
        Assets.loadTexture("ui/Inventory_Back14.png","Inventory_Back14");
        Assets.loadTexture("ui/Inventory_Back17.png","Inventory_Back17");
        Assets.loadTexture("ui/Cursor_0.png","Cursor_0");

        //ITEMS

        Assets.loadTexture("items/Item_0.png","Item_0");
        Assets.loadTexture("items/Item_2.png","Item_2");
        Assets.loadTexture("items/Item_3.png","Item_3");
        Assets.loadTexture("items/Item_8.png","Item_8");
        Assets.loadTexture("items/Item_9.png","Item_9");
        Assets.loadTexture("items/Item_26.png","Item_26");
        Assets.loadTexture("items/Item_30.png","Item_30");
        Assets.loadTexture("items/Item_121.png","Item_121");
        Assets.loadTexture("items/Item_520.png","Item_520");
        Assets.loadTexture("items/Item_521.png","Item_521");
        Assets.loadTexture("items/Item_547.png","Item_547");
        Assets.loadTexture("items/Item_548.png","Item_548");
        Assets.loadTexture("items/Item_549.png","Item_549");
        Assets.loadTexture("items/Item_575.png","Item_575");
        Assets.loadTexture("items/Item_757.png","Item_757");
        Assets.loadTexture("items/Item_1326.png","Item_1326");
        Assets.loadTexture("items/Item_2763.png","Item_2763");
        Assets.loadTexture("items/Item_2764.png","Item_2764");
        Assets.loadTexture("items/Item_2765.png","Item_2765");
        Assets.loadTexture("items/Item_2786.png","Item_2786");
        Assets.loadTexture("items/Item_4956.png","Item_4956");
        Assets.loadTexture("items/Item_5005.png","Item_5005");

        //TILES

        Assets.loadTexture("tiles/Tiles_0.png","Tiles_0");
        Assets.loadTexture("tiles/Tiles_1.png","Tiles_1");
        Assets.loadTexture("tiles/Tiles_2.png","Tiles_2");
        Assets.loadTexture("tiles/Tiles_3.png","Tiles_3");
        Assets.loadTexture("tiles/Tiles_4.png","Tiles_4");
        Assets.loadTexture("tiles/Tiles_5.png","Tiles_5");
        Assets.loadTexture("tiles/Tiles_30.png","Tiles_30");
        Assets.loadTexture("tiles/Wall_1.png","Wall_1");
        Assets.loadTexture("tiles/Wall_2.png","Wall_2");
        Assets.loadTexture("tiles/Wall_65.png","Wall_65");
        Assets.loadTexture("tiles/Tree_Branches_0.png","Tree_Branches_0");
        Assets.loadTexture("tiles/Tree_Branches_6.png","Tree_Branches_6");
        Assets.loadTexture("tiles/Tree_Tops_0.png","Tree_Tops_0");
        Assets.loadTexture("tiles/Tree_Tops_6.png","Tree_Tops_6");

        //SHADERS

        Assets.loadShader("shaders/inv_shader","inv_shader");
        Assets.loadShader("shaders/shader","shader");
        Assets.loadShader("shaders/map_shader","map_shader");

        //PROJECTILES

        Assets.loadTexture("projectiles/projectile_132","projectile_132");

        //LAST_PLAYER

        Assets.loadTexture("player_last/hands.png","hands");
        Assets.loadTexture("player_last/hands2.png","hands2");
        Assets.loadTexture("player_last/hands3.png","hands3");
        Assets.loadTexture("player_last/shirt.png","shirt");
        Assets.loadTexture("player_last/undershirt.png","undershirt");

        //SOUNDS

        Assets.loadSound("sounds/Dig_0.wav","Dig_0");
        Assets.loadSound("sounds/Dig_1.wav","Dig_1");
        Assets.loadSound("sounds/Dig_2.wav","Dig_2");

        Assets.loadSound("sounds/Tink_0.wav","Tink_0");
        Assets.loadSound("sounds/Tink_1.wav","Tink_1");
        Assets.loadSound("sounds/Tink_2.wav","Tink_2");

        Assets.loadSound("sounds/Mech_0.wav","Mech_0");

        //MUSICS

        Assets.loadMusic("music/04 - Overworld Day.mp3","music04");
        Assets.loadMusic("music/05 - Alternate Day.mp3","music05");
        Assets.loadMusic("music/06 - Rain.mp3","music06");
        Assets.loadMusic("music/18 - Underground Corruption.mp3","music18");
        Assets.loadMusic("music/31 - Underworld.mp3","music31");

        //PLAYER

        Assets.loadTexture("player/Player_0_0.png","Player_0_0");//
        Assets.loadTexture("player/Player_0_1.png","Player_0_1");//
        Assets.loadTexture("player/Player_0_2.png","Player_0_2");//
        //Assets.loadTexture("player/Player_0_3.png","Player_0_3");
        //Assets.loadTexture("player/Player_0_4.png","Player_0_4");
        Assets.loadTexture("player/Player_0_5.png","Player_0_5");//
        Assets.loadTexture("player/Player_0_6.png","Player_0_6");
        Assets.loadTexture("player/Player_0_7.png","Player_0_7");//
        Assets.loadTexture("player/Player_0_8.png","Player_0_8");
        //Assets.loadTexture("player/Player_0_9.png","Player_0_9");//
        Assets.loadTexture("player/Player_0_10.png","Player_0_10");//
        Assets.loadTexture("player/Player_0_11.png","Player_0_11");
        Assets.loadTexture("player/Player_0_12.png","Player_0_12");
        //Assets.loadTexture("player/Player_0_13.png","Player_0_13");
        //Assets.loadTexture("player/Player_0_14.png","Player_0_14");
        //Assets.loadTexture("player/Player_0_15.png","Player_0_15");

        //HAIR

        Assets.loadTexture("player/hair/Player_Hair_29.png","Hair_29");

        //ARMOR

        Assets.loadTexture("armor/Armor_187.png","Armor_187");
        Assets.loadTexture("armor/Armor_Head_185.png","Armor_Head_185");
        Assets.loadTexture("armor/Armor_Legs_127.png","Armor_Legs_127");

    }

    public static void defineTilesAndItems(TileManager tileManager){

        //ATTRIBUTES 1 - tileid

        ItemManager.defineItem(new Item(0,new FrameBuffer().addFrame("Item_0")).addTag("item_type",new Value<>("air")));
        ItemManager.defineItem(new Item(2,new FrameBuffer().addFrame("Item_2"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(2)));
        ItemManager.defineItem(new Item(3,new FrameBuffer().addFrame("Item_3"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(3)));
        ItemManager.defineItem(new Item(8,new FrameBuffer().addFrame("Item_8"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(4)));
        ItemManager.defineItem(new Item(9,new FrameBuffer().addFrame("Item_9"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(30)));
        ItemManager.defineItem(new Item(26,new FrameBuffer().addFrame("Item_26"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(8)));
        ItemManager.defineItem(new Item(30,new FrameBuffer().addFrame("Item_30"),0.35f).addTag("item_type",new Value<>("tile")).addTag("tile_id",new Value<>(6)));
        ItemManager.defineItem(new Item(121,new FrameBuffer().addFrame("Item_121"),0.75f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(520,new FrameBuffer().addFrameReg("Item_520",0,2+28*0,22,22).addFrameReg("Item_520",0,2+28*1,22,22).addFrameReg("Item_520",0,2+28*2,22,22).addFrameReg("Item_520",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(521,new FrameBuffer().addFrameReg("Item_521",0,2+28*0,22,22).addFrameReg("Item_521",0,2+28*1,22,22).addFrameReg("Item_521",0,2+28*2,22,22).addFrameReg("Item_521",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(547,new FrameBuffer().addFrameReg("Item_547",0,2+28*0,22,22).addFrameReg("Item_547",0,2+28*1,22,22).addFrameReg("Item_547",0,2+28*2,22,22).addFrameReg("Item_547",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(548,new FrameBuffer().addFrameReg("Item_548",0,2+28*0,22,22).addFrameReg("Item_548",0,2+28*1,22,22).addFrameReg("Item_548",0,2+28*2,22,22).addFrameReg("Item_548",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(549,new FrameBuffer().addFrameReg("Item_549",0,2+28*0,22,22).addFrameReg("Item_549",0,2+28*1,22,22).addFrameReg("Item_549",0,2+28*2,22,22).addFrameReg("Item_549",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(575,new FrameBuffer().addFrameReg("Item_575",0,2+28*0,22,22).addFrameReg("Item_575",0,2+28*1,22,22).addFrameReg("Item_575",0,2+28*2,22,22).addFrameReg("Item_575",0,2+28*3,22,22),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(757,new FrameBuffer().addFrame("Item_757"),0.65f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(1326,new FrameBuffer().addFrame("Item_1326"),0.65f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(2763,new FrameBuffer().addFrame("Item_2763"),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(2764,new FrameBuffer().addFrame("Item_2764"),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(2765,new FrameBuffer().addFrame("Item_2765"),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(2786,new FrameBuffer().addFrame("Item_2786"),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(4956,new FrameBuffer().addFrame("Item_4956"),0.35f).addTag("item_type",new Value<>("")));
        ItemManager.defineItem(new Item(5005,new FrameBuffer().addFrame("Item_5005"),0.35f).addTag("item_type",new Value<>("")));

        tileManager.addTileDataReg(1,0,"Tiles_2",18*9,18*3,16,16);
        tileManager.addTileDataReg(1,1,"Tiles_2",18*9,18*0,16,16);
        tileManager.addTileDataReg(1,2,"Tiles_2",18*6,18*4,16,16);
        tileManager.addTileDataReg(1,3,"Tiles_2",18*12,18*0,16,16);
        tileManager.addTileDataReg(1,4,"Tiles_2",18*6,18*0,16,16);
        tileManager.addTileDataReg(1,5,"Tiles_2",18*0,18*3,16,16);
        tileManager.addTileDataReg(1,6,"Tiles_2",18*1,18*0,16,16);
        tileManager.addTileDataReg(1,7,"Tiles_2",18*1,18*3,16,16);
        tileManager.addTileDataReg(1,8,"Tiles_2",18*5,18*0,16,16);
        tileManager.addTileDataReg(1,9,"Tiles_2",18*0,18*0,16,16);
        tileManager.addTileDataReg(1,10,"Tiles_2",18*1,18*1,16,16);
        tileManager.addTileDataReg(1,11,"Tiles_2",18*4,18*0,16,16);
        tileManager.addTileDataReg(1,12,"Tiles_2",18*6,18*3,16,16);
        tileManager.addTileDataReg(1,13,"Tiles_2",18*0,18*4,16,16);
        tileManager.addTileDataReg(1,14,"Tiles_2",18*1,18*2,16,16);
        tileManager.addTileDataReg(1,15,"Tiles_2",18*1,18*4,16,16);

        tileManager.addTileDataReg(2,0,"Tiles_0",18*9,18*3,16,16);
        tileManager.addTileDataReg(2,1,"Tiles_0",18*9,18*0,16,16);
        tileManager.addTileDataReg(2,2,"Tiles_0",18*6,18*4,16,16);
        tileManager.addTileDataReg(2,3,"Tiles_0",18*12,18*0,16,16);
        tileManager.addTileDataReg(2,4,"Tiles_0",18*6,18*0,16,16);
        tileManager.addTileDataReg(2,5,"Tiles_0",18*0,18*3,16,16);
        tileManager.addTileDataReg(2,6,"Tiles_0",18*1,18*0,16,16);
        tileManager.addTileDataReg(2,7,"Tiles_0",18*1,18*3,16,16);
        tileManager.addTileDataReg(2,8,"Tiles_0",18*5,18*0,16,16);
        tileManager.addTileDataReg(2,9,"Tiles_0",18*0,18*0,16,16);
        tileManager.addTileDataReg(2,10,"Tiles_0",18*1,18*1,16,16);
        tileManager.addTileDataReg(2,11,"Tiles_0",18*4,18*0,16,16);
        tileManager.addTileDataReg(2,12,"Tiles_0",18*6,18*3,16,16);
        tileManager.addTileDataReg(2,13,"Tiles_0",18*0,18*4,16,16);
        tileManager.addTileDataReg(2,14,"Tiles_0",18*1,18*2,16,16);
        tileManager.addTileDataReg(2,15,"Tiles_0",18*1,18*4,16,16);

        tileManager.addTileDataReg(3,0,"Tiles_1",18*9,18*3,16,16);
        tileManager.addTileDataReg(3,1,"Tiles_1",18*9,18*0,16,16);
        tileManager.addTileDataReg(3,2,"Tiles_1",18*6,18*4,16,16);
        tileManager.addTileDataReg(3,3,"Tiles_1",18*12,18*0,16,16);
        tileManager.addTileDataReg(3,4,"Tiles_1",18*6,18*0,16,16);
        tileManager.addTileDataReg(3,5,"Tiles_1",18*0,18*3,16,16);
        tileManager.addTileDataReg(3,6,"Tiles_1",18*1,18*0,16,16);
        tileManager.addTileDataReg(3,7,"Tiles_1",18*1,18*3,16,16);
        tileManager.addTileDataReg(3,8,"Tiles_1",18*5,18*0,16,16);
        tileManager.addTileDataReg(3,9,"Tiles_1",18*0,18*0,16,16);
        tileManager.addTileDataReg(3,10,"Tiles_1",18*1,18*1,16,16);
        tileManager.addTileDataReg(3,11,"Tiles_1",18*4,18*0,16,16);
        tileManager.addTileDataReg(3,12,"Tiles_1",18*6,18*3,16,16);
        tileManager.addTileDataReg(3,13,"Tiles_1",18*0,18*4,16,16);
        tileManager.addTileDataReg(3,14,"Tiles_1",18*1,18*2,16,16);
        tileManager.addTileDataReg(3,15,"Tiles_1",18*1,18*4,16,16);

        tileManager.addTileDataReg(30,0,"Tiles_30",18*9,18*3,16,16);
        tileManager.addTileDataReg(30,1,"Tiles_30",18*9,18*0,16,16);
        tileManager.addTileDataReg(30,2,"Tiles_30",18*6,18*4,16,16);
        tileManager.addTileDataReg(30,3,"Tiles_30",18*12,18*0,16,16);
        tileManager.addTileDataReg(30,4,"Tiles_30",18*6,18*0,16,16);
        tileManager.addTileDataReg(30,5,"Tiles_30",18*0,18*3,16,16);
        tileManager.addTileDataReg(30,6,"Tiles_30",18*1,18*0,16,16);
        tileManager.addTileDataReg(30,7,"Tiles_30",18*1,18*3,16,16);
        tileManager.addTileDataReg(30,8,"Tiles_30",18*5,18*0,16,16);
        tileManager.addTileDataReg(30,9,"Tiles_30",18*0,18*0,16,16);
        tileManager.addTileDataReg(30,10,"Tiles_30",18*1,18*1,16,16);
        tileManager.addTileDataReg(30,11,"Tiles_30",18*4,18*0,16,16);
        tileManager.addTileDataReg(30,12,"Tiles_30",18*6,18*3,16,16);
        tileManager.addTileDataReg(30,13,"Tiles_30",18*0,18*4,16,16);
        tileManager.addTileDataReg(30,14,"Tiles_30",18*1,18*2,16,16);
        tileManager.addTileDataReg(30,15,"Tiles_30",18*1,18*4,16,16);

        for(int i=0; i<45; i++)
            tileManager.addTileDataReg(7,i,"Tiles_3",18*i,22*0,16,20,1,10f/8,0,-2f/8);

        tileManager.addTileDataReg(4,0,"Tiles_4",24*0,24*0,20,20);
        tileManager.addTileDataReg(4,1,"Tiles_4",24*1,24*0,20,20);
        tileManager.addTileDataReg(4,2,"Tiles_4",24*2,24*0,20,20);
        tileManager.addTileDataReg(4,3,"Tiles_4",24*3,24*0,20,20);
        tileManager.addTileDataReg(4,4,"Tiles_4",24*4,24*0,20,20);
        tileManager.addTileDataReg(4,5,"Tiles_4",24*5,24*0,20,20);

        tileManager.addTileDataReg(6,0,"Wall_2",36*9,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,1,"Wall_2",36*9,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,2,"Wall_2",36*6,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,3,"Wall_2",36*12,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,4,"Wall_2",36*6,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,5,"Wall_2",36*0,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,6,"Wall_2",36*1,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,7,"Wall_2",36*1,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,8,"Wall_2",36*5,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,9,"Wall_2",36*0,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,10,"Wall_2",36*1,36*1,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,11,"Wall_2",36*4,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,12,"Wall_2",36*6,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,13,"Wall_2",36*0,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,14,"Wall_2",36*1,36*2,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(6,15,"Wall_2",36*1,36*4,32,32,2,2,-1f/2,-1f/2);

        tileManager.addTileDataReg(8,0,"Wall_1",36*9,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,1,"Wall_1",36*9,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,2,"Wall_1",36*6,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,3,"Wall_1",36*12,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,4,"Wall_1",36*6,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,5,"Wall_1",36*0,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,6,"Wall_1",36*1,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,7,"Wall_1",36*1,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,8,"Wall_1",36*5,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,9,"Wall_1",36*0,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,10,"Wall_1",36*1,36*1,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,11,"Wall_1",36*4,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,12,"Wall_1",36*6,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,13,"Wall_1",36*0,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,14,"Wall_1",36*1,36*2,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(8,15,"Wall_1",36*1,36*4,32,32,2,2,-1f/2,-1f/2);

        tileManager.addTileDataReg(65,0,"Wall_65",36*9,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,1,"Wall_65",36*9,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,2,"Wall_65",36*6,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,3,"Wall_65",36*12,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,4,"Wall_65",36*6,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,5,"Wall_65",36*0,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,6,"Wall_65",36*1,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,7,"Wall_65",36*1,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,8,"Wall_65",36*5,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,9,"Wall_65",36*0,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,10,"Wall_65",36*1,36*1,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,11,"Wall_65",36*4,36*0,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,12,"Wall_65",36*6,36*3,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,13,"Wall_65",36*0,36*4,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,14,"Wall_65",36*1,36*2,32,32,2,2,-1f/2,-1f/2);
        tileManager.addTileDataReg(65,15,"Wall_65",36*1,36*4,32,32,2,2,-1f/2,-1f/2);

        tileManager.addTileDataReg(5,0,"Tiles_5",22*0,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,1,"Tiles_5",22*1,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,2,"Tiles_5",22*2,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,3,"Tiles_5",22*3,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,4,"Tiles_5",22*4,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,5,"Tiles_5",22*5,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,6,"Tiles_5",22*6,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,7,"Tiles_5",22*7,22*0,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,8,"Tiles_5",22*0,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,9,"Tiles_5",22*1,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,10,"Tiles_5",22*2,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,11,"Tiles_5",22*3,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,12,"Tiles_5",22*4,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,13,"Tiles_5",22*5,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,14,"Tiles_5",22*6,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,15,"Tiles_5",22*7,22*3,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,16,"Tiles_5",22*0,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,17,"Tiles_5",22*1,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,18,"Tiles_5",22*2,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,19,"Tiles_5",22*3,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,20,"Tiles_5",22*4,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,21,"Tiles_5",22*5,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,22,"Tiles_5",22*6,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,23,"Tiles_5",22*7,22*6,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,24,"Tiles_5",22*0,22*9,20,20,10f/8,10f/8,-1f/8,-2f/8);
        tileManager.addTileDataReg(5,25,"Tree_Tops_0",82*0,80*0,80,80,80f/16,80f/16,-32f/16,0);
        tileManager.addTileDataReg(5,26,"Tree_Tops_0",82*1,80*0,80,80,80f/16,80f/16,-32f/16,0);
        tileManager.addTileDataReg(5,27,"Tree_Tops_0",82*2,80*0,80,80,80f/16,80f/16,-32f/16,0);
        tileManager.addTileDataReg(5,28,"Tree_Branches_0",42*0,42*0,40,40,20f/8,20f/8,-12f/8,-6f/8);
        tileManager.addTileDataReg(5,29,"Tree_Branches_0",42*1,42*0,40,40,20f/8,20f/8,-0f/8,-6f/8);
        tileManager.addTileDataReg(5,30,"Tree_Branches_0",42*0,42*1,40,40,20f/8,20f/8,-12f/8,-6f/8);
        tileManager.addTileDataReg(5,31,"Tree_Branches_0",42*1,42*1,40,40,20f/8,20f/8,-0f/8,-6f/8);
        tileManager.addTileDataReg(5,32,"Tree_Branches_0",42*0,42*2,40,40,20f/8,20f/8,-12f/8,-6f/8);
        tileManager.addTileDataReg(5,33,"Tree_Branches_0",42*1,42*2,40,40,20f/8,20f/8,-0f/8,-6f/8);


    }

}
