package analysis.RTA;

import java.util.List;

import analysis.Analysis;
import analysis.AnalysisStmtSwitch;
import analysis.Node;
import soot.SootField;
import soot.SootMethod;
import soot.jimple.AbstractStmtSwitch;

public class RTAAnalysis extends Analysis {

	// TODO: YOUR CODE HERE: Add representation for the RTA analysis results
	
	@Override
	protected AbstractStmtSwitch getStmtVisitor(SootMethod m) {
		// If you are certified wizardTM, go ahead and rewrite the Jimple visitor,
		// otherwise you can use mine
		return new AnalysisStmtSwitch(m,this);
	}

	@Override
	public void showResult() {
		// TODO: Auto-generated method stub
		// TODO: YOUR CODE HERE: Display results according to specification
		// for Submitty autograding
	}

		
	// TODO: YOUR CODE HERE: fill in the auto-generated stubs by creating RTA
	// constraints/transfer functions. Note that you DO NOT NEED constraints for
	// each kind of statement. If you do create a constraint, don't forget to
	// add it to sootConstraints: 
	// addToMap(sootConstraints,enclMethod,newConstraint);
	
	// TODO: YOUR CODE HERE: If you are new to program analysis, it may be 
	// useful to add prints in these hooks, just to see what gets analyzed
	
	@Override
	public void assignStmt(SootMethod enclMethod, Node lhs, Node rhs) {
		// TODO Auto-generated method stub
	}

	@Override
	public void fieldWriteStmt(SootMethod enclMethod, Node lhs, SootField f, Node rhs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fieldReadStmt(SootMethod enclMethod, Node lhs, Node rhs, SootField f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void arrayWriteStmt(SootMethod enclMethod, Node lhs, Node rhs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void arrayReadStmt(SootMethod enclMethod, Node lhs, Node rhs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void directCallStmt(SootMethod enclMethod, int callSiteId, Node lhs, SootMethod target, List<Node> args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void virtualCallStmt(SootMethod enclMethod, int callSiteId, Node lhs, SootMethod target, List<Node> args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void allocStmt(SootMethod enclMethod, int allocSiteId, Node lhs, Node alloc) {
		// TODO Auto-generated method stub

	}

}
