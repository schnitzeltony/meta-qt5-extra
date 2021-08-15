SUMMARY = "Client-side decoration for all Qt-based Wayland clients"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

# HACK
# support qtwayland's qwaylanddisplay_p.h find
# <QtXkbCommonSupport/private/qxkbcommon_p.h>
# have no idea where to fix properly
CXXFLAGS += "-I${STAGING_INCDIR}/QtXkbCommonSupport/5.15.2"

PV = "1.1.0+git${SRCPV}"

SRCREV = "6a5de23f2e5162fbee39d16f938473ff970a2ec0"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${libdir}/plugins \
"
