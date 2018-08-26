package com.mpoznyak.domain.commands.cases;

import com.mpoznyak.domain.model.Case;
import com.mpoznyak.domain.repository.Repository;
import com.mpoznyak.domain.repository.Specification;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class RemoveCaseTest {

    Case mCase = mock(Case.class);
    RemoveCase interactor = mock(RemoveCase.class);
    Specification specification = mock(Specification.class);
    Repository repository = mock(Repository.class);

    @Test
    public void testExecute() {
        interactor.execute(mCase, repository);
        verify(interactor).execute(mCase, repository);

    }

}