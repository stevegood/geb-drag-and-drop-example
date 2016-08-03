package rocks.stevegood.testing.dnd

import geb.Page

class DragAndDropPage extends Page {

  static url = System.getProperty('BASE_URL')

  static at = {
    title == 'Drag and Drop'
  }

  static content = {
    bird { $('#bird') }
    instructions { $('#instructions') }
    tree { $('#tree') }
  }

}
