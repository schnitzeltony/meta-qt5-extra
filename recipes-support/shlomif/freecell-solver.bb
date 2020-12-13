SUMMARY = "Program that automatically solves layouts of Freecell and similar variants"
HOMEPAGE = "https://www.shlomifish.org/open-source/projects/freecell-solver/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.asciidoc;md5=767c2b76f9e7b88434106e0b8823a577"

SRC_URI = "http://fc-solve.shlomifish.org/downloads/fc-solve/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "34b924e2774ef167d673055c32a829edb1fc9b44112544e99834272a8119af76"
PV = "5.24.0"

inherit cmake perlnative python3native

DEPENDS += " \
    gperf-native \
    perl-path-tiny-native \
    perl-template-toolkit-native \
    python3-random2-native \
    python3-six-native \
    pysol-cards-native \
    gmp \
    rinutils \
"

EXTRA_OECMAKE = " \
    -DFCS_WITH_TEST_SUITE=OFF \
    -DBUILD_STATIC_LIBRARY=OFF \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

# was: 'probably-redundant RPATH /usr/lib' - not exactly a bad breaker. Looked
# into but could't find why this is thrown - so ignore for now.
INSANE_SKIP_${PN} = "useless-rpaths"

RDEPENDS_${PN} += "pysol-cards"
