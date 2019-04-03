inherit kde-base

PLASMA_VERSION = "5.15.4"
PLASMA_FIXUP_VERSION = "5.15.4.1"

SRC_URI = "${KDE_MIRROR}/stable/plasma/${PLASMA_VERSION}/${BPN}-${PV}.tar.xz"

DEPENDS += " \
    kwayland \
"
