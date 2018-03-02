// Generated from D:/Windows Desktop/Stuff/University Stuff/Year 3/Dependable Systems/Coursework - CV/analysisToolCoursework/AnalyseToolDependableSystem/src/Util\Operators.g4 by ANTLR 4.7
package Util.gen.Util;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperatorsParser}.
 */
public interface OperatorsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#javaSource}.
	 * @param ctx the parse tree
	 */
	void enterJavaSource(OperatorsParser.JavaSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#javaSource}.
	 * @param ctx the parse tree
	 */
	void exitJavaSource(OperatorsParser.JavaSourceContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#typeDecls}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecls(OperatorsParser.TypeDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeDecls}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecls(OperatorsParser.TypeDeclsContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#classTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeDeclaration(OperatorsParser.ClassTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeDeclaration(OperatorsParser.ClassTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsClause(OperatorsParser.ClassExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsClause(OperatorsParser.ClassExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtendsClause(OperatorsParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtendsClause(OperatorsParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(OperatorsParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(OperatorsParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParameterList(OperatorsParser.GenericTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParameterList(OperatorsParser.GenericTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeListClosing}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeListClosing(OperatorsParser.GenericTypeListClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeListClosing}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeListClosing(OperatorsParser.GenericTypeListClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParameter(OperatorsParser.GenericTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParameter(OperatorsParser.GenericTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(OperatorsParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(OperatorsParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeDeclaration(OperatorsParser.EnumTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeDeclaration(OperatorsParser.EnumTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(OperatorsParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(OperatorsParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumScopeDeclarations(OperatorsParser.EnumScopeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumScopeDeclarations(OperatorsParser.EnumScopeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#enumClassScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassScopeDeclarations(OperatorsParser.EnumClassScopeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#enumClassScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassScopeDeclarations(OperatorsParser.EnumClassScopeDeclarationsContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeDeclaration(OperatorsParser.InterfaceTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeDeclaration(OperatorsParser.InterfaceTypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#classScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassScopeDeclarations(OperatorsParser.ClassScopeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassScopeDeclarations(OperatorsParser.ClassScopeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceScopeDeclarations(OperatorsParser.InterfaceScopeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceScopeDeclarations(OperatorsParser.InterfaceScopeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classFieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterClassFieldDeclaratorList(OperatorsParser.ClassFieldDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classFieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitClassFieldDeclaratorList(OperatorsParser.ClassFieldDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#classFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterClassFieldDeclarator(OperatorsParser.ClassFieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#classFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitClassFieldDeclarator(OperatorsParser.ClassFieldDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceFieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFieldDeclaratorList(OperatorsParser.InterfaceFieldDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceFieldDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFieldDeclaratorList(OperatorsParser.InterfaceFieldDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#interfaceFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFieldDeclarator(OperatorsParser.InterfaceFieldDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#interfaceFieldDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFieldDeclarator(OperatorsParser.InterfaceFieldDeclaratorContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator(OperatorsParser.ArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator(OperatorsParser.ArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#arrayDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaratorList(OperatorsParser.ArrayDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#arrayDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaratorList(OperatorsParser.ArrayDeclaratorListContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#throwsClause}.
	 * @param ctx the parse tree
	 */
	void enterThrowsClause(OperatorsParser.ThrowsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#throwsClause}.
	 * @param ctx the parse tree
	 */
	void exitThrowsClause(OperatorsParser.ThrowsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(OperatorsParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(OperatorsParser.ModifierListContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#localModifierList}.
	 * @param ctx the parse tree
	 */
	void enterLocalModifierList(OperatorsParser.LocalModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#localModifierList}.
	 * @param ctx the parse tree
	 */
	void exitLocalModifierList(OperatorsParser.LocalModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void enterLocalModifier(OperatorsParser.LocalModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void exitLocalModifier(OperatorsParser.LocalModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OperatorsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OperatorsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(OperatorsParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(OperatorsParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(OperatorsParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(OperatorsParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#objectTypeSimplified}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeSimplified(OperatorsParser.ObjectTypeSimplifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#objectTypeSimplified}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeSimplified(OperatorsParser.ObjectTypeSimplifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedTypeIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedTypeIdent(OperatorsParser.QualifiedTypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedTypeIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedTypeIdent(OperatorsParser.QualifiedTypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedTypeIdentSimplified}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedTypeIdentSimplified(OperatorsParser.QualifiedTypeIdentSimplifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedTypeIdentSimplified}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedTypeIdentSimplified(OperatorsParser.QualifiedTypeIdentSimplifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeIdent}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdent(OperatorsParser.TypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeIdent}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdent(OperatorsParser.TypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#typeIdentSimplified}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentSimplified(OperatorsParser.TypeIdentSimplifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#typeIdentSimplified}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentSimplified(OperatorsParser.TypeIdentSimplifiedContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeArgumentList(OperatorsParser.GenericTypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeArgumentList(OperatorsParser.GenericTypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeArgument(OperatorsParser.GenericTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeArgument(OperatorsParser.GenericTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericWildcardBoundType}.
	 * @param ctx the parse tree
	 */
	void enterGenericWildcardBoundType(OperatorsParser.GenericWildcardBoundTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericWildcardBoundType}.
	 * @param ctx the parse tree
	 */
	void exitGenericWildcardBoundType(OperatorsParser.GenericWildcardBoundTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeArgumentListSimplified}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeArgumentListSimplified(OperatorsParser.GenericTypeArgumentListSimplifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeArgumentListSimplified}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeArgumentListSimplified(OperatorsParser.GenericTypeArgumentListSimplifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#genericTypeArgumentSimplified}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeArgumentSimplified(OperatorsParser.GenericTypeArgumentSimplifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#genericTypeArgumentSimplified}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeArgumentSimplified(OperatorsParser.GenericTypeArgumentSimplifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedIdentList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentList(OperatorsParser.QualifiedIdentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedIdentList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentList(OperatorsParser.QualifiedIdentListContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#formalParameterStandardDecl}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterStandardDecl(OperatorsParser.FormalParameterStandardDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#formalParameterStandardDecl}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterStandardDecl(OperatorsParser.FormalParameterStandardDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#formalParameterVarArgDecl}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterVarArgDecl(OperatorsParser.FormalParameterVarArgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#formalParameterVarArgDecl}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterVarArgDecl(OperatorsParser.FormalParameterVarArgDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(OperatorsParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(OperatorsParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(OperatorsParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(OperatorsParser.AnnotationListContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#annotationInit}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInit(OperatorsParser.AnnotationInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationInit}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInit(OperatorsParser.AnnotationInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationInitializers}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInitializers(OperatorsParser.AnnotationInitializersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationInitializers}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInitializers(OperatorsParser.AnnotationInitializersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInitializer(OperatorsParser.AnnotationInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInitializer(OperatorsParser.AnnotationInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationElementValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementValue(OperatorsParser.AnnotationElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationElementValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementValue(OperatorsParser.AnnotationElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationElementValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementValueExpression(OperatorsParser.AnnotationElementValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationElementValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementValueExpression(OperatorsParser.AnnotationElementValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationElementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementValueArrayInitializer(OperatorsParser.AnnotationElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationElementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementValueArrayInitializer(OperatorsParser.AnnotationElementValueArrayInitializerContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#annotationBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationBody(OperatorsParser.AnnotationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationBody(OperatorsParser.AnnotationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationScopeDeclarations(OperatorsParser.AnnotationScopeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationScopeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationScopeDeclarations(OperatorsParser.AnnotationScopeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#annotationDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDefaultValue(OperatorsParser.AnnotationDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#annotationDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDefaultValue(OperatorsParser.AnnotationDefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(OperatorsParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(OperatorsParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(OperatorsParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(OperatorsParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(OperatorsParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(OperatorsParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(OperatorsParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(OperatorsParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#forEachLoop_forLoop_statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachLoop_forLoop_statement(OperatorsParser.ForEachLoop_forLoop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forEachLoop_forLoop_statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachLoop_forLoop_statement(OperatorsParser.ForEachLoop_forLoop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#try_catch_finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_finally_statement(OperatorsParser.Try_catch_finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#try_catch_finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_finally_statement(OperatorsParser.Try_catch_finally_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(OperatorsParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(OperatorsParser.CatchesContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(OperatorsParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(OperatorsParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchBlockLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockLabels(OperatorsParser.SwitchBlockLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchBlockLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockLabels(OperatorsParser.SwitchBlockLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchCaseLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseLabels(OperatorsParser.SwitchCaseLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchCaseLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseLabels(OperatorsParser.SwitchCaseLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchCaseLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseLabel(OperatorsParser.SwitchCaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchCaseLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseLabel(OperatorsParser.SwitchCaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#switchDefaultLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefaultLabel(OperatorsParser.SwitchDefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#switchDefaultLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefaultLabel(OperatorsParser.SwitchDefaultLabelContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(OperatorsParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(OperatorsParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#forUpdater}.
	 * @param ctx the parse tree
	 */
	void enterForUpdater(OperatorsParser.ForUpdaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#forUpdater}.
	 * @param ctx the parse tree
	 */
	void exitForUpdater(OperatorsParser.ForUpdaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(OperatorsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(OperatorsParser.ParenthesizedExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link OperatorsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(OperatorsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(OperatorsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(OperatorsParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(OperatorsParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(OperatorsParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(OperatorsParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(OperatorsParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(OperatorsParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(OperatorsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(OperatorsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(OperatorsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(OperatorsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(OperatorsParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(OperatorsParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(OperatorsParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(OperatorsParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(OperatorsParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(OperatorsParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(OperatorsParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(OperatorsParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(OperatorsParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(OperatorsParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OperatorsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OperatorsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(OperatorsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(OperatorsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(OperatorsParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(OperatorsParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(OperatorsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(OperatorsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#postfixedExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixedExpression(OperatorsParser.PostfixedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#postfixedExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixedExpression(OperatorsParser.PostfixedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(OperatorsParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(OperatorsParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#qualifiedIdentExpression}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentExpression(OperatorsParser.QualifiedIdentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#qualifiedIdentExpression}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentExpression(OperatorsParser.QualifiedIdentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(OperatorsParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(OperatorsParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#innerNewExpression}.
	 * @param ctx the parse tree
	 */
	void enterInnerNewExpression(OperatorsParser.InnerNewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#innerNewExpression}.
	 * @param ctx the parse tree
	 */
	void exitInnerNewExpression(OperatorsParser.InnerNewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperatorsParser#newArrayConstruction}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayConstruction(OperatorsParser.NewArrayConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperatorsParser#newArrayConstruction}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayConstruction(OperatorsParser.NewArrayConstructionContext ctx);
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
}