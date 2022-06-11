require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
"

SRC_URI += " \
    file://0002-Do-not-do-the-cross-dance-for-katehighlightingindexe.patch \
    file://0003-Revert-Simplify-header-install-locations.patch \
"
