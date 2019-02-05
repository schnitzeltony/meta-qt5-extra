SUMMARY = "Program that automatically solves layouts of Freecell and similar variants"
HOMEPAGE = "hhttp://fc-solve.shlomifish.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.asciidoc;md5=767c2b76f9e7b88434106e0b8823a577"

SRC_URI = "http://fc-solve.shlomifish.org/downloads/fc-solve/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "def258dd81ac99928fa9187ff16a6285"
SRC_URI[sha256sum] = "696717df7e4fab2d5a038b26cc23e2259f7b68a101bc8a4855dffa2841699dfd"

inherit cmake perlnative

DEPENDS += " \
    gperf-native \
    perl-path-tiny-native \
    perl-template-toolkit-native \
"

EXTRA_OECMAKE = " \
    -DFCS_WITH_TEST_SUITE=OFF \
    -DBUILD_STATIC_LIBRARY=OFF \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

# was: 'probably-redundant RPATH /usr/lib' - not exactly a bad breaker. Looked
# into but could't find why this is thrown - so ignore for now.
INSANE_SKIP_${PN} = "useless-rpaths"
