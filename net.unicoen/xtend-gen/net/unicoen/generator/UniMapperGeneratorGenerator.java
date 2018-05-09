/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.generator;

import com.google.common.collect.Iterators;
import net.unicoen.generator.ANTLRGrammarGenerator;
import net.unicoen.uniMapperGenerator.Grammar;
import net.unicoen.util.InvokingStateAnalyzer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class UniMapperGeneratorGenerator extends AbstractGenerator {
  private String _grammarName;
  
  private InvokingStateAnalyzer _analyzer;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final ANTLRGrammarGenerator g4Generator = new ANTLRGrammarGenerator(fsa);
    final Procedure1<Grammar> _function = (Grammar it) -> {
      this._grammarName = this.toCamelCase(it.getName());
      final String parserCode = g4Generator.generate(this._grammarName, it);
      InvokingStateAnalyzer _invokingStateAnalyzer = new InvokingStateAnalyzer(parserCode, it);
      this._analyzer = _invokingStateAnalyzer;
      fsa.generateFile((this._grammarName + "Mapper.ts"), "sample generate");
    };
    IteratorExtensions.<Grammar>forEach(Iterators.<Grammar>filter(resource.getAllContents(), Grammar.class), _function);
  }
  
  public String toCamelCase(final String str) {
    char _upperCase = Character.toUpperCase(str.charAt(0));
    String _substring = str.substring(1);
    return (Character.valueOf(_upperCase) + _substring);
  }
}
