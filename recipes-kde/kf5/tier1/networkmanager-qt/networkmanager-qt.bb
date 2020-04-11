SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "37f280a09b0f6a4dcc46a884f0e4cc08"
SRC_URI[sha256sum] = "9e836e8dd97931231bb92b5ae84777dc54977860aeed881d784209868a2759f0"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}
