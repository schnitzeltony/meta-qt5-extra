inherit kde-base

PLASMA_VERSION = "5.15.3"
PLASMA_FIXUP_VERSION = "5.15.3.2"

SRC_URI = "${KDE_MIRROR}/stable/plasma/${PLASMA_VERSION}/${BPN}-${PV}.tar.xz"

DEPENDS += " \
    kwayland \
"
