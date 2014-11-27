require ${BPN}.inc

inherit native

DEPENDS += "libxslt-native libxml2-native karchive-native ki18n-native"

# allarch packages do only install into host sysroot
OECMAKE_EXTRA_ROOT_PATH = "${STAGING_DIR}/${MACHINE}"
