// Generated from D:/Windows Desktop/Stuff/University Stuff/Year 3/Dependable Systems/Coursework - CV/analysisToolCoursework/AnalyseToolDependableSystem/src/Util\Operators.g4 by ANTLR 4.7
package Util.gen.Util;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperatorsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperatorsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#javaSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaSource(OperatorsParser.JavaSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(OperatorsParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecls(OperatorsParser.TypeDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(OperatorsParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(OperatorsParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(OperatorsParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypeDeclaration(OperatorsParser.ClassTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsClause(OperatorsParser.ClassExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceExtendsClause(OperatorsParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(OperatorsParser.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeParameterList(OperatorsParser.GenericTypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeListClosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeListClosing(OperatorsParser.GenericTypeListClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeParameter(OperatorsParser.GenericTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(OperatorsParser.BoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumTypeDeclaration(OperatorsParser.EnumTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(OperatorsParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumScopeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumScopeDeclarations(OperatorsParser.EnumScopeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumClassScopeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassScopeDeclarations(OperatorsParser.EnumClassScopeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(OperatorsParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(OperatorsParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeDeclaration(OperatorsParser.InterfaceTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(OperatorsParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(OperatorsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(OperatorsParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classScopeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassScopeDeclarations(OperatorsParser.ClassScopeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceScopeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceScopeDeclarations(OperatorsParser.InterfaceScopeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classFieldDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFieldDeclaratorList(OperatorsParser.ClassFieldDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classFieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFieldDeclarator(OperatorsParser.ClassFieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceFieldDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFieldDeclaratorList(OperatorsParser.InterfaceFieldDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceFieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFieldDeclarator(OperatorsParser.InterfaceFieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(OperatorsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(OperatorsParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator(OperatorsParser.ArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arrayDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaratorList(OperatorsParser.ArrayDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(OperatorsParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#throwsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsClause(OperatorsParser.ThrowsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(OperatorsParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(OperatorsParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#localModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalModifierList(OperatorsParser.LocalModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#localModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalModifier(OperatorsParser.LocalModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OperatorsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(OperatorsParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(OperatorsParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#objectTypeSimplified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeSimplified(OperatorsParser.ObjectTypeSimplifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedTypeIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedTypeIdent(OperatorsParser.QualifiedTypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedTypeIdentSimplified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedTypeIdentSimplified(OperatorsParser.QualifiedTypeIdentSimplifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdent(OperatorsParser.TypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeIdentSimplified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentSimplified(OperatorsParser.TypeIdentSimplifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(OperatorsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeArgumentList(OperatorsParser.GenericTypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeArgument(OperatorsParser.GenericTypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericWildcardBoundType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericWildcardBoundType(OperatorsParser.GenericWildcardBoundTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeArgumentListSimplified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeArgumentListSimplified(OperatorsParser.GenericTypeArgumentListSimplifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericTypeArgumentSimplified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeArgumentSimplified(OperatorsParser.GenericTypeArgumentSimplifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedIdentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentList(OperatorsParser.QualifiedIdentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(OperatorsParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameterStandardDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterStandardDecl(OperatorsParser.FormalParameterStandardDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameterVarArgDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterVarArgDecl(OperatorsParser.FormalParameterVarArgDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(OperatorsParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(OperatorsParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(OperatorsParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationInit(OperatorsParser.AnnotationInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationInitializers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationInitializers(OperatorsParser.AnnotationInitializersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationInitializer(OperatorsParser.AnnotationInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationElementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValue(OperatorsParser.AnnotationElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationElementValueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValueExpression(OperatorsParser.AnnotationElementValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationElementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementValueArrayInitializer(OperatorsParser.AnnotationElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(OperatorsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationBody(OperatorsParser.AnnotationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationScopeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationScopeDeclarations(OperatorsParser.AnnotationScopeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDefaultValue(OperatorsParser.AnnotationDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OperatorsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(OperatorsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(OperatorsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OperatorsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(OperatorsParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(OperatorsParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(OperatorsParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(OperatorsParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forEachLoop_forLoop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoop_forLoop_statement(OperatorsParser.ForEachLoop_forLoop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#try_catch_finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_finally_statement(OperatorsParser.Try_catch_finally_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(OperatorsParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(OperatorsParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(OperatorsParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchBlockLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockLabels(OperatorsParser.SwitchBlockLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchCaseLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseLabels(OperatorsParser.SwitchCaseLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchCaseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseLabel(OperatorsParser.SwitchCaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchDefaultLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefaultLabel(OperatorsParser.SwitchDefaultLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(OperatorsParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(OperatorsParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forUpdater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdater(OperatorsParser.ForUpdaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(OperatorsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(OperatorsParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OperatorsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(OperatorsParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(OperatorsParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(OperatorsParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(OperatorsParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(OperatorsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(OperatorsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(OperatorsParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(OperatorsParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(OperatorsParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(OperatorsParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(OperatorsParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(OperatorsParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(OperatorsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(OperatorsParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(OperatorsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#postfixedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixedExpression(OperatorsParser.PostfixedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(OperatorsParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedIdentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentExpression(OperatorsParser.QualifiedIdentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(OperatorsParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#innerNewExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerNewExpression(OperatorsParser.InnerNewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#newArrayConstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayConstruction(OperatorsParser.NewArrayConstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(OperatorsParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OperatorsParser.LiteralContext ctx);
}