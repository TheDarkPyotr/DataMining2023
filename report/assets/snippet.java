  public boolean flipNotify(){

        try{
            //Notify the controller the flip event: blink red if request is denied
            //N.B: the `oldValue` and `newValue` are not used by the controller so are arbitrary
            //set as useless values.
            this.notifyFlip.fireVetoableChange("flipExchange", 0,null);

            return true;

        }catch (PropertyVetoException e){

            Thread r = new Thread(() -> flashColor(Color.red));

            r.start();

        }

        return false;
    }

  //Invocation in `EightBoard` class
  flipButton.addActionListener(evt -> {
              if(flipButton.flipNotify()){
                  int oldValue = tilesArray[0].getTileLabel();
                  tilesArray[0].setTileLabel(tilesArray[1].getTileLabel());
                  tilesArray[1].setTileLabel(oldValue);
              }
          });