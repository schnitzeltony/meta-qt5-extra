# Since Qt5.15 qtwaylandscanner creates a comment as:

# // source file is /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-mortsgna-linux-gnueabi/kwayland/5.70.0-r0/recipe-sysroot/usr/share/wayland-protocols/unstable/tablet/tablet-unstable-v2.xml

# which triggers our make_extra_sanity.bbclass.
# To be compatible with Qt5.14 (dunfell) and >= Qt5.15 (current master) we do
# some sed instead of patching.
do_patch:append:class-native() {
    bb.build.exec_func('do_fix_qtwaylandscanner_cpp', d)
}

do_fix_qtwaylandscanner_cpp () {
    if [ -f ${S}/src/qtwaylandscanner/qtwaylandscanner.cpp ]; then
        sed -i 's:printf("// source file is://printf("// source file is:' ${S}/src/qtwaylandscanner/qtwaylandscanner.cpp
    fi
}
