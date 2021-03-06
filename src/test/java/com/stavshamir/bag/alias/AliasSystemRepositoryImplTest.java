package com.stavshamir.bag.alias;

import org.junit.Test;

import java.io.IOException;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class AliasSystemRepositoryImplTest {

    private AliasSystemRepository aliasSystemRepository = new AliasSystemRepositoryImpl("src/main/resources/alias.sh");

    @Test
    public void getAliases() throws IOException {
        Set<Alias> aliases = aliasSystemRepository.getAliases();

        assertThat(aliases)
                .contains(new Alias("ls", "ls --color=auto"));
    }

}