// Generated from D:/Windows Desktop/Stuff/University Stuff/Year 3/Dependable Systems/Coursework - CV/analysisToolCoursework/AnalyseToolDependableSystem/src/main/java/Util\Operators.g4 by ANTLR 4.7
package Util.gen.Util;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperatorsParser}.
 */
public interface OperatorsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(OperatorsParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(OperatorsParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(OperatorsParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(OperatorsParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(OperatorsParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(OperatorsParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(OperatorsParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(OperatorsParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(OperatorsParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(OperatorsParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(OperatorsParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(OperatorsParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(OperatorsParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(OperatorsParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(OperatorsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(OperatorsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(OperatorsParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(OperatorsParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(OperatorsParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(OperatorsParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(OperatorsParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(OperatorsParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(OperatorsParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(OperatorsParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(OperatorsParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(OperatorsParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(OperatorsParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(OperatorsParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(OperatorsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(OperatorsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(OperatorsParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(OperatorsParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(OperatorsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(OperatorsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(OperatorsParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(OperatorsParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(OperatorsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(OperatorsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(OperatorsParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(OperatorsParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(OperatorsParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(OperatorsParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(OperatorsParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(OperatorsParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(OperatorsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(OperatorsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(OperatorsParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(OperatorsParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(OperatorsParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(OperatorsParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(OperatorsParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(OperatorsParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(OperatorsParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(OperatorsParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(OperatorsParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(OperatorsParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(OperatorsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(OperatorsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(OperatorsParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(OperatorsParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(OperatorsParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(OperatorsParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(OperatorsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(OperatorsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(OperatorsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(OperatorsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(OperatorsParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(OperatorsParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(OperatorsParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(OperatorsParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(OperatorsParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(OperatorsParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(OperatorsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(OperatorsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(OperatorsParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(OperatorsParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(OperatorsParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(OperatorsParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(OperatorsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(OperatorsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(OperatorsParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(OperatorsParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(OperatorsParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(OperatorsParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(OperatorsParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(OperatorsParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(OperatorsParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(OperatorsParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(OperatorsParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(OperatorsParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(OperatorsParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(OperatorsParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(OperatorsParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(OperatorsParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OperatorsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OperatorsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(OperatorsParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(OperatorsParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(OperatorsParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(OperatorsParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(OperatorsParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(OperatorsParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(OperatorsParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(OperatorsParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(OperatorsParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(OperatorsParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(OperatorsParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(OperatorsParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(OperatorsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(OperatorsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(OperatorsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(OperatorsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(OperatorsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(OperatorsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(OperatorsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(OperatorsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(OperatorsParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(OperatorsParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(OperatorsParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(OperatorsParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(OperatorsParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(OperatorsParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(OperatorsParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(OperatorsParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(OperatorsParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(OperatorsParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OperatorsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OperatorsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(OperatorsParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(OperatorsParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(OperatorsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(OperatorsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(OperatorsParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(OperatorsParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OperatorsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OperatorsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(OperatorsParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(OperatorsParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(OperatorsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(OperatorsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(OperatorsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(OperatorsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OperatorsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OperatorsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#tryStatementNoResources}.
	 * @param ctx the parse tree
	 */
	void enterTryStatementNoResources(OperatorsParser.TryStatementNoResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#tryStatementNoResources}.
	 * @param ctx the parse tree
	 */
	void exitTryStatementNoResources(OperatorsParser.TryStatementNoResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#tryStatementWithResources}.
	 * @param ctx the parse tree
	 */
	void enterTryStatementWithResources(OperatorsParser.TryStatementWithResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#tryStatementWithResources}.
	 * @param ctx the parse tree
	 */
	void exitTryStatementWithResources(OperatorsParser.TryStatementWithResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(OperatorsParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(OperatorsParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(OperatorsParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(OperatorsParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(OperatorsParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(OperatorsParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(OperatorsParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(OperatorsParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(OperatorsParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(OperatorsParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(OperatorsParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(OperatorsParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(OperatorsParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(OperatorsParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(OperatorsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(OperatorsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(OperatorsParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(OperatorsParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(OperatorsParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(OperatorsParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(OperatorsParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(OperatorsParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(OperatorsParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(OperatorsParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(OperatorsParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(OperatorsParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(OperatorsParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(OperatorsParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(OperatorsParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(OperatorsParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OperatorsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OperatorsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(OperatorsParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(OperatorsParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(OperatorsParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(OperatorsParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(OperatorsParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(OperatorsParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(OperatorsParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(OperatorsParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(OperatorsParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(OperatorsParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(OperatorsParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(OperatorsParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(OperatorsParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(OperatorsParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(OperatorsParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(OperatorsParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(OperatorsParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(OperatorsParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(OperatorsParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(OperatorsParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(OperatorsParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(OperatorsParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(OperatorsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(OperatorsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(OperatorsParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(OperatorsParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(OperatorsParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(OperatorsParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(OperatorsParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(OperatorsParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(OperatorsParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(OperatorsParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(OperatorsParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(OperatorsParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(OperatorsParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(OperatorsParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(OperatorsParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(OperatorsParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(OperatorsParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(OperatorsParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(OperatorsParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(OperatorsParser.ArgumentsContext ctx);
}