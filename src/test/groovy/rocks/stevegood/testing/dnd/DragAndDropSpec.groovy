package rocks.stevegood.testing.dnd

import geb.navigator.Navigator
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class DragAndDropSpec extends GebReportingSpec {

  def "The user navigates to the Drag and Drop page"() {
    when: 'The user navigates to the Drag and Drop page'
    to DragAndDropPage

    then: 'The user is at the Drag and Drop Page'
    at DragAndDropPage
  }

  def "Tests dragging and dropping the bird on the tree"() {
    given: 'The bird, the instructions and the tree'
    Navigator bird = page.bird
    Navigator instructions = page.instructions
    Navigator tree = page.tree

    when: 'The user drags the bird to the tree'
    interact {
      moveToElement bird
      clickAndHold()
      moveToElement tree
      release()
      perform()
    }

    then: 'The instructions should read: "Chirp, chirp", says the bird.'
    instructions.text() == '"Chirp, chirp", says the bird.'
  }

}
