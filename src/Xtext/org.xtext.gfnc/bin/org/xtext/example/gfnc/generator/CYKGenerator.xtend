/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.gfnc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.gfnc.cYK.GFNC

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CYKGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val grammar = resource.contents.head as GFNC
		fsa.generateFile('Output.txt', getOutput(grammar))
	
	}
	
	def getInput(GFNC grammar) {
		var input = ""
		for(terminal : grammar.w){
			input += terminal.^terminals
		}
		input
	}
	
	def getNoTerminals(GFNC grammar){
		var noTerminals = newArrayList()
		
		for(production : grammar.productions){
			noTerminals.add(production.left.^noTerminals)
		}
		
		noTerminals
	}
	
	def getProduction(GFNC grammar){

	} 
	
	
	def getOutput(GFNC grammar){
		'''
		Imprime
		«getInput(grammar)»
		////
		«getNoTerminals(grammar)»
		«getProduction(grammar)»
		'''
	}
	
}
