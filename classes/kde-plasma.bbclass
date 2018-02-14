inherit kde-base

PLASMA_VERSION = "5.12.1"

SRC_URI = "${KDE_MIRROR}/stable/plasma/${PV}/${BPN}-${PV}.tar.xz"

DEPENDS += " \
    kwayland \
"
