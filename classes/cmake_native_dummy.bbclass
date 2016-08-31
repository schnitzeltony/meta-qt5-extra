#
# Class to create dummy native binaries so cmake can reference them
# Inspired by binconfig-disabled.bbclass
#

inherit native

# The list of scripts which should be disabled.
CMAKE_DUMMY_BINARIES ?= ""

do_install () {
    install -d ${D}${bindir}
    for x in ${CMAKE_DUMMY_BINARIES}; do
        echo "#!/bin/sh" > ${D}${bindir}/$x
        # Make the disabled script emit invalid parameters for those configure
        # scripts which call it without checking the return code.
        echo "echo '--should-not-have-used-$x'" >> ${D}${bindir}/$x
        echo "exit 1" >> ${D}${bindir}/$x
        chmod 755 ${D}${bindir}/$x
    done
}

